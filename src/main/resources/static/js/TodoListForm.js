const todoListControl = new TodoListController;

newTodoListForm.addEventListener("submit", (event) => {
    event.preventDefault();

    const newTitle = document.querySelector("#newTitle");
    const newDescription = document.querySelector("#newDescription");
    const newTargetDate = document.querySelector("#newTargetDate");

    const title = newTitle.value;
    const description = newDescription.value;
    const targetDate = newTargetDate.value;

    newTitle.value = "";
    newDescription.value = "";
    newTargetDate.value = "";

    todoListControl.addTodo(title, description, targetDate);
})