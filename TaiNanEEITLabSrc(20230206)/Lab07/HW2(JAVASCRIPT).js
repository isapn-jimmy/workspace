<script >
document.getElementById("idName").addEventListener("blur",checkName);
     function checkName(){
     
         let theNameObj=document.getElementById("idName");
         console.log(theNameObj);
         let theNameObjVal=theNameObj.value;
         console.log(theNameObjVal);
         console.log(typeof theNameObjVal);
         let theNameObjValLen=theNameObjVal.length;
         let n=document.getElementById("idn");
         let re = /[\u4e00-\u9fff]/;
         let ch1,flaga=false,flagb=false,flagc=false;
         if(theNameObjVal==""){
             n.innerHTML="<img src='Images/error.png'>you must enter"; 
         }else if(theNameObjValLen<2){
             n.innerHTML="<img src='Images/error.png'>incorrect,Password length must be greater than 2";
             }else{ 
             for (let i = 0; i < theNameObjValLen; i++) {
             if (re.test(theNameObjVal.charAt(i))) {
             n.innerHTML="<img src='Images/check.png'>correct";
         } 
                else{ n.innerHTML="<img src='Images/error.png'>incorrect,全中文";}
                break;}}}
                
            
       
     document.getElementById("idPwd").addEventListener("blur",checkPwd);
     function checkPwd(){
         
         //取得idPwd元素
         let thePwdObj=document.getElementById("idPwd");
         // console.log(thePwdObj);
         // console.log(typeof thePwdObj);  //object
         //取得idPwd元素值
         let thePwdObjVal=thePwdObj.value;
         // console.log(thePwdObjVal);
         // console.log(typeof thePwdObjVal);  //string

         //判斷元素值是否為空白，密碼長度是否大於等於6
         //如果長度是否大於等於6，判斷是否包含字母、數字、特殊符號
         let thePwdObjValLen=thePwdObjVal.length;
         let sp=document.getElementById("idsp");
         let ch,flag1=false,flag2=false,flag3=false;

         if(thePwdObjVal==""){
             sp.innerHTML="<img src='Images/error.png'>you must enter"; 
         }else if (thePwdObjValLen < 6) {
     sp.innerHTML = "<img src='Images/error.png' >請輸入6個字以上 ";
             
         }
         
         else if(thePwdObjValLen>=6){
             // sp.innerHTML=">=6";
             for(let i=0;i<thePwdObjValLen;i++){
                 ch=thePwdObjVal.charAt(i).toUpperCase();
                 console.log(ch);
                 if(ch>="A" && ch<="Z")
                     flag1=true;
                 else if(ch>="0" && ch<="9")
                     flag2=true;
                else if (ch == "!" || ch == "@" || ch == "#" || ch == "$" || ch == "%" || ch == "^" || ch == "&" || ch == "*"){
                     flag3=true;
                }else{
                 if(flag1&&flag2&&flag3)
                 break;
                }
             }  //for
             if(flag1&&flag2&&flag3){
                 sp.innerHTML="<img src='Images/check.png'>correct";
             }else  {
                 sp.innerHTML="<img src='Images/error.png'>incorrect";
         
 }
            
     }}
     document.getElementById("idDate").addEventListener("blur",checkDate);
     function checkDate(){
         let theDateObj=document.getElementById("idDate");
         let theDateObjVal=theDateObj.value;                      
         let d=document.getElementById("idd");
         let daysplit = theDateObjVal.split("/"); //用斜線做隔開
         //daysplit[0]是年， daysplit[1] - 1是月份，可是會-1要在+1回來，daysplit[2]是日期
         let day = new Date( daysplit[0], daysplit[1] - 1,daysplit[2]);

         if(theDateObjVal==""){
             // document.getElementById("idd");
             d.innerHTML="<img src='Images/error.png'>you must enter"; 
         }else if(day.getFullYear()===Number(daysplit[0]) &&day.getMonth()+1===Number(daysplit[1])&& day.getDate===Number(daysplit[2])){
             d.innerHTML="<img src='Images/check.png'>correct"; 
         }else{
             d.innerHTML="<img src='Images/error.png'>incorrect, cannot find the date"; 
         }




     }
 </script>