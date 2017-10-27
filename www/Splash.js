module.exports = {
    clear : function(successCallback, errorCallback){
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'Splash', // mapped to our native Java class called "CalendarPlugin"
            'echonox-splash', // with this action name
            null
        );
    },
};
