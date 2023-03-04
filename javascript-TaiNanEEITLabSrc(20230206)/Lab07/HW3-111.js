<script>
        let mouseOvercheck=true;
        let mouseOutcheck=true;
        let clickcheck = true;
        // http://blog.shihshih.com/css-filter/
        for(let i = 1 ; i<=5 ;i++){
        document.getElementById("idstar"+i).addEventListener("mouseover",mouseOver);  //事件繫結，滑鼠滑入
        document.getElementById("idstar"+i).addEventListener("mouseout",mouseOut);    //事件繫結，滑鼠滑出
        document.getElementById("idstar"+i).addEventListener("click",oneclick);    //事件繫結，點擊
        document.getElementById("idstar"+i).addEventListener("dblclick",reset);    //事件繫結，雙擊點擊
        }
        
        

        function mouseOver(e) {//e代表event物件，作為參數來使用
            if(mouseOvercheck){
            let mousetarget = Number(e.currentTarget.id.charAt(6)); //idstar1有6個索引值(i、d、s、t、a、r、1)、idstar2有6個索引值~idstar5有6個索引值
            for(let i = 1;i<=parseInt(mousetarget);i++){
                document.getElementById("idstar"+i).src="Images/chngstar.gif";
            }
         }
        }
        function mouseOut(e) {
            if(mouseOutcheck){
            let mousetarget=Number(e.currentTarget.id.charAt(6));
            for(let i =1; i<= parseInt(mousetarget);i++){
                document.getElementById("idstar"+i).src="Images/star.gif";
            }
         }
        }
        function oneclick(e){
            if(clickcheck){
            let mousetarget = Number(e.currentTarget.id.charAt(6));
            for(let i =1 ; i<= parseInt(mousetarget);i++){
                document.getElementById("idstar"+i).src="Images/chngstar.gif";
            }
            document.getElementsByClassName("p2")[0].innerHTML=`評分${mousetarget}星`;
            mouseOutcheck=false;
            mouseOutcheck=false;
            clickcheck=false;
         }
        }
        function reset(e){
            // let mousetarget = Number(e.currentTarget.id.charAt(6));
            for(let i =1 ; i<= 5;i++){
                document.getElementById("idstar"+i).src="Images/star.gif";
            }
            document.getElementsByClassName("p2")[0].innerHTML = "評分為：";
            //document.getElementsByClassName("p2")[0].innerHTML="評分";
            // let d=document.getElementsByClassName("p2")[0];
            mouseOutcheck=true;
            mouseOutcheck=true;
            clickcheck=true;
        }
    </script>