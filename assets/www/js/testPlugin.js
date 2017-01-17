var testPlugin = {
    ejecutarServicio: function(successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "TestPlugin", "ejecutarServicio",[]);
    }
};