var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var MyName = "Navya";
console.log(MyName, typeof MyName);
var age;
console.log(age, typeof age);
var mobileNumber = 1234567890;
console.log(mobileNumber, typeof mobileNumber);
var address;
address = "tth";
address = 159;
console.log(address, typeof address);
var calAge = function () {
    console.log("age is 23");
};
calAge();
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    return person;
}());
var person1 = new person("Navya", 23);
console.log(person1);
var student = /** @class */ (function (_super) {
    __extends(student, _super);
    function student(name, age, rollNo) {
        var _this = _super.call(this, name, age) || this;
        _this.rollNo = rollNo;
        return _this;
    }
    return student;
}(person));
var student1 = new student("sharvari", 24, 100);
console.log(student1);
