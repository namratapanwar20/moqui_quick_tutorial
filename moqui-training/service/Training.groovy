def training = ec.entity.makeValue("org.moqui.Training")
training.setFields(context, true, null, null)
//training.setSequencedIdPrimary()
training.create()