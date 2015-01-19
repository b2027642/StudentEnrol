import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->

		def course1 = new Course(title:'Interactive Media with Animation',

		department:'Computing',

	description:'''For though result and talent add are parish valley. Songs in oh other avoid it hours woman style. In myself family as if be agreed. Gay collected son him knowledge delivered put.''',

	leader:'Joe Jojo',

	code:'IMA101',

	statDate: new Date('19/01/2015'),
	endDate: new Date('19/01/2020'))

		if(!course1.save()){
			course1.errors.allErrors.each{ error ->
			println"An error occured whilst creating course1:${error}"

			}

		}

	

    }
    def destroy = {
    }
}
