import com.library.*

class BootStrap{

    def init = { servletContext ->

		def course1=new Course(title:'Web Architectures',

				description:"'In this this module we are going to be looking at how to install and configure web infrastructure sytems. The learning materials will be organised by week and if you have any problems accessing them please contact me as soon as you can.'",

				tutor: 'Tonderai Maswera',

				code: 'WA101',

				department: 'Computing').save()


def course2=new Course(title:'EBusiness',

				description:"'The aim of this module is to help you develop a current perspective of e-Business.  The intent is to discuss the core concepts re Businesses' electronic strategy, their associated drivers and inhibitors, as well as enabling technologies. Your engagement with this module will help you get the most out of the leaning activities and materials we have been preparing. We look forward to meeting you.'",

				tutor: 'Elizabeth Uruchurtu',

				code: 'EB101',

				department: 'Computing').save()


def course3=new Course(title:'IT Service Delivery',

				description:"'Welcome to ITSD - the second module on IT Service Management.You may want to brush up on your ITSS knowledge from Year 1, as ITSD builds on this. The module follows the same format as before - one lecture and one tutorial per week.See you on Monday 28th September at 2pm in Cantor 9231 for the first lecture.'",

				tutor: 'Lynne Dawson',

				code: 'ITSD156',

				department: 'Computing').save()


def book1=new Book(title:'The Alchemist',

				author:'Paulo Coelho',

				isbn:'089567428',

				student: 'Frank Sekyere',

				dateBorrowed: ('19/03/2016'),

				returnDate: ('23/03/2016')).save()

def book2=new Book(title:'Computing: A Concise History',

				author:'Pe Ceruzzi',

				isbn:'026251767',

				student: 'Qasim Shah',

				dateBorrowed: ('10/03/2016'),

				returnDate: ('18/03/2016')).save()

def book3=new Book(title:'Computer Science: A Very Short Introduction',

				author:'Subrata Dasgupta',

				isbn:'019873346',

				student: 'Shabaz Khalid',

				dateBorrowed: ('09/03/2016'),

				returnDate: ('23/03/2016')).save()


def library1=new Library(location:'City Campus: Adsetts',

				openingHours:'Open 24 Hours',

				student: 'FrankSekyere',

				book: 'The Alchemist',

				librarian: 'Will Smith').save()


def library2=new Library(location:'City Campus: Adsetts',

				openingHours:'Open 24 Hours',

				student: 'Qasim Shah',

				book: 'Computing: A Concise History',

				librarian: 'Will Smith').save()

def library3=new Library(location:'City Campus: Adsetts',

				openingHours:'Open 24 Hours',

				student: 'Shabaz Khalid',

				book: 'Computer Science: A Very Short Introduction',

				librarian: 'Will Smith').save()


def librarian1=new Librarian(userName:'b4025516',

				password:'password',

				name: 'Will Smith',

				email: 'b4025516@my.shu.ac.uk',

				telephone: '0114260958').save()


def librarian2=new Librarian(userName:'b3028830',

				password:'password',

				name: 'Matt Harati',

				email: 'b3028830@my.shu.ac.uk',

				telephone: '0114260958').save()

def librarian3=new Librarian(userName:'b3021780',

				password:'password',

				name: 'Saad Tahir',

				email: 'b3021780@my.shu.ac.uk',

				telephone: '0114260958').save()


def student1=new Student(studentId:'b4019796',

				name: 'Frank Sekyere',

				email: 'b4019796@my.shu.ac.uk',

				course: 'Computing').save()

def student2=new Student(studentId:'b40103011',

				name: 'Shabaz Khalid',

				email: 'b40103011@my.shu.ac.uk',

				course: 'Computing').save()


def student3=new Student(studentId:'b1035385',

				name: 'Qasim Shah',

				email: 'b1035385@my.shu.ac.uk ',

				course: 'Computing').save()






def destroy = {
}


}
}
