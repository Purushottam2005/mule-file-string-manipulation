def index = message.getInvocationProperty('originalFileTokens').size()
def fileName = originalFileTokens.getAt(index-1)
def newPath = File.separator + originalFileTokens.getAt(1) + File.separator + originalFileTokens.getAt(2) + File.separator
println('Index in groovy=' + index)
println('Filename in groovy-' + fileName)
println('Lookup value - ' + message.getInvocationProperty('customlookupvalue'))
message.setInvocationProperty('originalFileName', fileName)
message.setInvocationProperty('newFilePathName', newPath)
return payload