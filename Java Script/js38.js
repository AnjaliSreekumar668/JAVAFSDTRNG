const person = {fname:"John",lname:"Doe",age:25};
let txt ="";
for(let x in person){
	txt +=person[x] + " ";
	}
	

document.getElementById("demo").innerHTML= txt;