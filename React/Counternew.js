import React, {Component} from 'react';

class Counternew extends Component{
   constructor(props){
       super(props);
       this.state = {
           counter : 0,
           x : 5,
           y:"test"
       };
   }
    increment(){
        setTimeout(()=>{
            this.setState( (prev,props)=>({counter:prev.counter+1}));
        },1000)
        
            
       
    }
    render(){
        this.increment();
        return(
            <div>
                <p>{this.state.counter}</p>
                </div>
        )
    }
}
export default Counternew;