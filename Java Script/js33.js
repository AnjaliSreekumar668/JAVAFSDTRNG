const numbers = [45,4,9,16,25];
 
 let txt ="";
 numbers.forEach(myFunction);

 document.getElementById("demo").innerHTML = txt;
 function myFunction(value,index,array){
	 txt +=value + "<br>";
	 
 }