function getSpecByTableName(tableName) {

    var table;


    switch (tableName.toLowerCase()) {
        case "doctors":
            table = "doctor";
            break;
        case "groomers":
            table = "groomer";
            break;

        case "hairdressers":
            table = "hairdresser";

        default:
            table = "notFound";
            break;
    }

    var url = "http://localhost:8080/admin/api/specialist/" + table;
    var request = new XMLHttpRequest();

    request.open("GET", url);

    request.onload = function () {
        if (request.readyState = 4 && request.status == 200){
            var myData = JSON.parse(request.responseText);
            console.log(myData);
            renderTable(myData);
        } else {
            request.error = function () {
                console.log("something went wrong");
            }
        }
    };

    request.send();
}

function renderTable(data) {

    var table = document.getElementById("table");
    var i;
    var tr = "";

    while (table.hasChildNodes()){
        table.removeChild(table.firstChild);
    }

    var trheader = "<tr>\n" +
        "<th>user id</th>\n" +
        "<th>freelancer id</th>\n" +
        "<th>first name</th>\n" +
        "<th>last name</th>\n" +
        "<th>email</th>\n" +
        "<th>tel</th>\n" +
        "<th>experience</th>\n" +
        "<th>became freelancer</th>\n" +
        "</tr>";

    table.insertAdjacentHTML('afterbegin', trheader);

    if (table.style.display = "none") {
        table.style.display = "block";
    }


    for (i = 0; i < data.length; i++) {
        tr += "<tr>";
        tr += "<td>" + data[i].id + "</td>";
        tr += "<td>" + data[i].freelancerApi.id + "</td>";
        tr += "<td>" + data[i].firstName + "</td>";
        tr += "<td>" + data[i].lastName + "</td>";
        tr += "<td>" + data[i].email + "</td>";
        tr += "<td>" + data[i].tel + "</td>";
        tr += "<td>" + data[i].freelancerApi.experience + "</td>";
        tr += "<td>" + data[i].freelancerApi.becameFreelancer + "</td>";
        tr += "</tr>";
        table.insertAdjacentHTML('beforeend', tr);
    }


}
