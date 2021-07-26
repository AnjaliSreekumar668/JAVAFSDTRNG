import React from 'react';
var count = 0;
function Counter(){
    count++;
    return(
        <div>
            <p>{count}</p>
            </div>
    );
}
export default Counter;