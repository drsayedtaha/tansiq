var form = document.getElementById("dep_form")
form.addEventListener("submit",add_data)


function add_data(params) {
    // this function get the data from wishes form and add div containing this data 

    var dep_name = document.getElementById("name_box").value
    var from_num = document.getElementById("from_num").value
    var to_num = document.getElementById("to_num").value

    var materials =document.getElementById("materials").getElementsByTagName("div")
    var i = 1
    
    var selected_materials=[]
    for (let i = 1; i < materials.length; i++) {
        material = materials[i].querySelectorAll("*");
        var mat_box = material[0]
        if (mat_box.checked) {
            var name = material[1].innerText
            var mat_deg = material[2].value
            selected_materials.push([name , mat_deg])
            
        }
        

    }

    var matelials_html="" 
    for (let i = 0; i < selected_materials.length; i++) {
        matelials_html = matelials_html.concat(`<div>
                <span>`+ selected_materials[i][0] + `</span>
                <span type="text" style="margin:0 20px 20px 50px ">`+ selected_materials[i][1] + `</span>
            </div>`)
    }

    var new_dep = `<div> 
                    <strong style="font-family: arabic"> قسم</strong>
                    <span style="margin-right: 85px">`+dep_name+
                    `</span>
                    </div>
            <br>
            <div id="number">
                <strong style="font-family: arabic; margin-left: 40px"> عدد طلاب :</strong>
                    <span>من</span>
                    <span  style="margin:0 19px 0 20px; width:20px">`+from_num+`</span>
                    <span>الي</span>
                    <span style="margin-right: 19px; width:20px">`+to_num+`</span>
            </div>
            <br>

            <div style="padding-right: 127px; display: flex;flex-wrap: wrap;">
            `+matelials_html+`
            
            </div>
            <br>
            <hr> <br> `

    var dep_review = document.getElementById("dep_review");
    dep_review.innerHTML+=new_dep;
    event.preventDefault();

}

