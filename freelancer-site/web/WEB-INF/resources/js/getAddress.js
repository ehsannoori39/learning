
function showAddress(userId){
        var addressA = document.getElementById("address_a_"+ id);
        addressA.style.display = 'none';

        console.log("clicked");

        var url = "http://localhost:8080/admin/api/user/address/" + userId;

        var request = new XMLHttpRequest();
        request.open("GET", url);

        console.log("opened");

        request.onload = function () {
            console.log(this.status);
            if (request.readyState = 4 && request.status == 200) {
                var myData = JSON.parse(request.responseText);
                renderHtml(myData, id);
            } else {
                request.error = function () {
                    console.log("ERROR");
                }
            }
        };

        request.send();
    }


function renderHtml(data, id) {
    var addressId = document.getElementById("address_" + id);
    addressId.innerText = data.country;
}

