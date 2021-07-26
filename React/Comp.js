import React, {Component} from 'react';

class Comp extends Component{
   constructor(props){
       super(props);
   }
    
    render(){
        return(
            <div>
                <p>{this.props.title}</p>
                </div>
        )
    }
}
export default Comp;