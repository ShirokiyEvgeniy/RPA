
        Map insertedParamMap = new HashMap()
        insertedParamMap.put("Precision", pr.toString())
        insertedParamMap.put("Recall", rc.toString())
        insertedParamMap.put("BP", item.getWrappedObject().getRun().getRootRunUuid().toString())
        jsonValueMap = new com.google.gson.Gson().toJson(insertedParamMap)
    