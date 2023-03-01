$(function () {
   let divWidth = $('#sliderBoard').width() //div的寬
   let imgCount = $('#content li').length //品項有幾項
   

   for(let i =0; i< imgCount; i++){ //i<8 第一張圖index[0]，幫圖片加進去
    $('#contentButton').append('<li></li>')

   }
    $('#contentButton li:first').addClass('clicked')//li的第一筆加入class

    $('#content li').width(divWidth) //給li的寬度 setter
    $('#content ').width(divWidth*imgCount) //給ul的寬度 setter ul是li的爸爸
                                   //li的寬度(27_slider.html)*個數
    let index =0
    let timer = setInterval(moveToNext,5000) //每隔多少時間做多少事情，用setInterval間格的意思setInterval(drawing,5000) ->5 secs叫一次函式不會停，clearInterval ->停止
//使用者靜止 5 secs沒有動作，圖片會自動轉到下一張圖
    $('#contentButton li').click(function(){
        index=$(this).index()    //被按得那一個圖片的索引值

        $('#content').animate({
            left: divWidth*index*-1, //往左邊滑動: div的寬度*index值*-1，ex 我的第一張圖是index=0， 0*-1=0=第一張圖片，第二張圖片=1(索引值)*-1=-1(代表我滑了一張圖就是第一張圖片，divWidth=一張圖的寬度)，第三張圖片=2*-1=-2(代表我滑了2張圖(第一張跟第二張圖片)，divWidth=2張圖的寬度 )
        })
        $(this).addClass('clicked')//我現在點的小圓點圖增加類別clicked，因為我按了這個小圓點圖顏色會變重
        $('#contentButton li').not(this).removeClass('clicked')//其他沒有被按小圓點圖則remove掉類別clicked，顏色變淡
    }) 
function moveToNext(){
//index++  -> 直接寫會有bug，如果後面沒有圖片了會依值增加控白的圖片出來，所以要增加if去做判斷

    if(index < imgCount-1){  //為了以防會有增加空白圖片的問題，我們設定只要超過7張則從頭開始繼續，不會再新增了
        index++
    }else{
        index=0
    }


    $('#content').animate({
        left: divWidth*index*-1,
    })
    $(`#contentButton li:eq(${index})`).addClass('clicked')//我如果現在看的是第二張圖，則這第二張圖(index=1)，就增加class clicked (28_main_css 的50行)
    $(`#contentButton li`).not(`:eq(${index})`).removeClass('clicked')//其他我沒有點的小圓點圖，將那些沒點的小圓點圖的顏色類別給remove掉
    


 }

 $('#content').resize(function{
    

 })
}
    


);