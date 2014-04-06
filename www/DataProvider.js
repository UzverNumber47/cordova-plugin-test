
var DataProvider = DataProvider || {};

DataProvider.getExamList = function ( success, failure )
{
  console.log ("Attempting to get list of exams ");
  cordova.exec(success, failure,
              "DataProvider",
              "getExamList",
              []);
}

module.exports = DataProvider;
