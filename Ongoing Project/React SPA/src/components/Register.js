import React from 'react';

function Register(props){
    return(
        <div>
            
<h1 >Register For Course</h1>
<form>
<label style={{marginRight:"10px"}}>First Name:</label>
<input type="text"  name="firstname" size="25"/><br></br>
<label>Middle Name</label>
<input type="text" name="middlename" size="25"/><br/>
<label Style="padding-right: 16px;">Last Name</label>
<input type="text" name="lastname" size="25"/><br/>
<label Style="padding-right: 16px;">Phone No:</label>
<input type="text" name="phone-no." size="25"/><br/>
</form>
<label style={{marginRight:"35px"}}>Gender</label>
<input type="radio" name="male"/>Male
<input type="radio" name="female"/>Female
<br/>

<label>Course Type</label>
<select>
<option value="Course Type">Type</option>
<option value="regular">Regular</option>
<option value="part-time">Part Time</option>


</select>
<br/>

<form >
<input type="submit" value="SUBMIT"/>
</form>

</div>           
        
       
    );
}

export default Register;