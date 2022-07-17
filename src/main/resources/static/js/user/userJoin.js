// function send(){
//     $.ajax(
//     {
//         type: "POST",
//         url: "user/userJoin",
//         async: true,
//         dataType: "text",
//         success: function(result){
//             if(result == 300){
//                 alert("중복된 아이디입니다.")
//                 return;
//             } else{
//                 document.joinForm.submit();
//                 location.href = "/board/showMyPet";
//             }
//         }
//
//     });
// }