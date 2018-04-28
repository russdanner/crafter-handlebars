import handlebars.HandlebarsProcessor

def handlebars = new HandlebarsProcessor()

def output = handlebars.process()

templateModel.output = output