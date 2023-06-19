console.log("Welcome to Ajax")

let fetchBtn = document.getElementById('fetchBtn');
fetchBtn.addEventListener('click', buttonClickHandler);

function buttonClickHandler(){
    console.log('You have clicked the button');
    //instantiate an xhr object
    const xhr= new XMLHttpRequest();
  xhr.open('GET','https://jsonplaceholder.typicode.com/posts/1', true);

    //xhr.open('POST','https://dummy.restapiexample.com/api/v1/create',true);
    //xhr.getResponseHeader('Content-type','application/json');
    
    xhr.onprogress=function(){
        console.log('On progress');
    }

    xhr.onload=function(){
        if(this.status===200){
            console.log(this.responseText);
        }
        else{
            console.log('Some error occured');
        }
    }
   //a=	{"name":"test","salary":"123","age":"23"};
   xhr.send();
   
  // xhr.open('GET','https://dummy.restapiexample.com/api/v1/employees', true);
   //xhr.send();

}
