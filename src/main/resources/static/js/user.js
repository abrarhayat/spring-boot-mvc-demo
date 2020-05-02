$(document).ready(function () {
    $.ajax({
        url: "http://localhost:8080/conference/user"
    }).then(function (data) {
        console.log("firstName: " + data.firstName)
        console.log("lastName: " + data.lastName)
        console.log("age: " + data.age)
        $('.firstName').append(data.firstName);
        $('.lastName').append(data.lastName);
        $('.age').append(data.age);
    });
});