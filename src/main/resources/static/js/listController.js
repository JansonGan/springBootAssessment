class TodoListController {
    constructor() {
        this.item = [];
    }

addTodo(title, description, targetDate) {
        let todoListController = this;
        const formData = new FormData();
        formData.append("title", title);
        formData.append("description", description);
        formData.append("targetDate", targetDate);

        fetch("http://localhost:8080/todolist/add", {
            method: "POST",
            body: formData
        }).then(function(response) {
            console.log(response.status);
            if(response.ok) {
                alert("New item added successfully!")
                window.location.href = "http://127.0.0.1:8080/listtable";
            }
        }).catch((error) => {
            console.error("Error: ", error);
            alert("Unable to add item.")
        });
}


displayItem() {

fetch("http://127.0.0.1:8080/todolist/alllist").then(response => {response.json().then( data => {
        console.log(data);
        if (data.length > 0) {
          let temp = "";
          data.forEach((list) => {
            temp += "<tr>";
            temp += "<td>" + list.title + "</td>";
            temp += "<td>" + list.description + "</td>";
            temp += "<td>" + list.targetDate + "</td></tr>";
          });
          document.getElementById('dataList').innerHTML = temp;
        }
      }
    )
  }
)
}
}