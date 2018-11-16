class Car {
    //field
    engine:string;

    //constructor
    constructor(engine:string){
        this.engine=engine
    }

    //function
    disp():void{
        console.log("Function displays Engine is : " +this.engine );
    }
}

//Create a Object
var obj= new Car("Honda");

//access the field
console.log("Reading attribute value Engine as :" + obj.engine);
//access the function
obj.disp();