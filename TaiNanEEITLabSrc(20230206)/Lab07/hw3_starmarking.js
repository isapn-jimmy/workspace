// mouseover, mouseout binding
for (let i = 1; i <= 5; i++) {
  document.getElementById("star" + i).addEventListener("mouseover", mouseOver);
  document.getElementById("star" + i).addEventListener("mouseout", mouseOut);
  document.getElementById("star" + i).addEventListener("click", clickStar);
  document.getElementById("star" + i).addEventListener("dblclick", doubleClickStar);

}
let mouseOvercheck = true;
let mouseOutcheck = true;
let clickCheck = true;

//mouseOver effect
function mouseOver(event) {
  if (mouseOvercheck) {
    let mouseTarget = Number(event.currentTarget.id.charAt(4));
    for (let i = 1; i <= mouseTarget; i++) {
      document.getElementById("star" + i).src = "Images copy/chngstar.gif";
    }
  }
}

//mouseOut effect
function mouseOut(event) {
  if (mouseOutcheck) {
    let mouseTarget = Number(event.currentTarget.id.charAt(4));
    for (let i = 1; i <= mouseTarget; i++) {
      document.getElementById("star" + i).src = "Images copy/star.gif";
    }
  }
}
//*/
function clickStar(event) {
  if (clickCheck) {
    let mouseTarget = Number(event.currentTarget.id.charAt(4));
    for (let i = 1; i <= mouseTarget; i++) {
      document.getElementById("star" + i).src = "Images copy/chngstar.gif";
    }
    document.getElementsByClassName("p2")[0].innerHTML = `您的評分為：${mouseTarget}顆星`;
    mouseOvercheck = false;
    mouseOutcheck = false;
    clickCheck = false;
  }

  // for (let i = 1; i <= 5; i++) {
  //   document.getElementById("star" + i).id = "starch" + i;
  // }
  // for (let i = 1; i <= 5; i++) {
  //   document.getElementById("starch" + i).addEventListener("dblclick", doubleClickStar);
  // }
}

function doubleClickStar() {
  // for (let i = 1; i <= 5; i++) {
  //   document.getElementById("starch" + i).id = `star${i}`;
  // }
  for (let i = 1; i <= 5; i++) {
    document.getElementById("star" + i).src = "Images copy/star.gif";
  }
  document.getElementsByClassName("p2")[0].innerHTML = "您的評分為：";
  mouseOvercheck = true;
  mouseOutcheck = true;
  clickCheck = true;
}
