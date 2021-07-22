 const points =[40,100,1,5,25,10];
 document.getElementById("demo").innerHTML = myArrayMin(points);
 
 function myArrayMin(arr) {
	 return Math.min.apply(null,arr);
 }