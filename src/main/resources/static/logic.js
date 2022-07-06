
//loop through array and update map
let dataMaker = () => {
    let mockData = new Array;
    let name = [""]
    let description = [""]
    let price = []
    let thumbnailURL = [""]
    let lessonURL = [""]
    mockData.push(name, description, lessonURL, price,thumbnailURL)
    return mockData
}




let createHomePage = () => {
    let mockData = dataMaker();
    console.log(mockData);
    for (let i = 0; i < mockData[0].length; i++) {
        let courseId = "course-" + i;
        let nameId = "name-" + i;
        document.getElementsByClassName("saved-course-thumbnail")[i].style.backgroundImage = mockData[4][i];
        document.getElementById(nameId).innerHTML = mockData[0][i];
        let ul = document.getElementsByClassName("small-text")[i];
        ul.getElementsByTagName("li")[0].innerHTML = mockData[1][i];
        ul.getElementsByTagName("li")[1].innerHTML = mockData[2][i];
        ul.getElementsByTagName("li")[2].innerHTML = mockData[3][i];
    }
}

let addLesson = () => {
    let lessonDiv = document.getElementById("lesson-div")
    let div = document.createElement("div");
    let nameLabel = document.createElement("label");
    let nameInput = document.createElement("input");
    let urlLabel = document.createElement("label");
    let urlInput = document.createElement("input");
    div.appendChild(nameLabel);
    div.appendChild(nameInput);
    div.appendChild(urlLabel);
    div.appendChild(urlInput);
    lessonDiv.appendChild(div);
    console.log(lessonDiv);
}

document.getElementById("add-lesson").onclick = addLesson;


