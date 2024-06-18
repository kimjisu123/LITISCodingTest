// 클릭 이벤트를 위한 박스 변수 선언
const box = document.getElementById("box");

// 카운트 변수 선언
let count = 0;

// 클릭시 카운트가 증가하는 함수
box.addEventListener('click', function(){
    count++;
    document.getElementById("num").innerHTML = count;
});
