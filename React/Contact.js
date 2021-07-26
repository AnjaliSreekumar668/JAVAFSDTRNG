import React from 'react';
import './Contact.css';

function Contact(props){
    //var st = {colour:"green",padding:10,border:"solid 1px gray"};
    return(
        <div className="test">
            <h1>{props.name} Contact Page</h1>
            <label>Email Address</label>
            <input type="text"  />
            <br />
            <label>Message</label>
            <textarea>
                </textarea>
                <button>Send</button>
                </div>
    )
}
  export default Contact;