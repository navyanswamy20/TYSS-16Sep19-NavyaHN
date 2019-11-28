let MyName : string = "Navya";
console.log(MyName, typeof MyName );

let age : number;
console.log(age, typeof age);

let mobileNumber = 1234567890;
console.log(mobileNumber, typeof mobileNumber);

let address;
address = "tth";
address = 159;
console.log(address, typeof address)

let calAge = function() : void{
    console.log("age is 23");
}
calAge();

class person{
    constructor(public name : string , public age : number){

    }
}
let person1 = new person("Navya", 23);
console.log(person1);

class student extends person{
    constructor(name : string, age : number , public rollNo : number){
        super (name,age)
    }
}
let student1 = new student("sharvari",24, 100);
console.log(student1);
