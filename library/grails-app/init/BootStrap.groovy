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






}

def destroy = {

}
}
