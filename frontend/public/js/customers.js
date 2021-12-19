const form = document.querySelector ("form")
form.addEventListener("submit", e => {
    e.preventDefault()    
    let firstName = form.first_name.value
    let lastName = form.last_name.value
    let middleName = form.middle_name.value
    let phoneNumber = form.phone_number.value
    let body = {firstName,lastName,middleName,phoneNumber}
    fetch('/api/customer', {
        method:"post", 
        body: JSON.stringify(body),
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
          },
    })    
    .then(res => res.text())
    .then(txt => alert("ok"))    
})

fetch('/api/customers?page=0')
    .then(res => res.json())
    .then(obj => {      
        const tbody = document.querySelector("tbody")
        const customers = obj._embedded.customers
        customers.forEach(customer => {
            const href = customer._links.self.href
            const id = href.substring(href.lastIndexOf("/")+ 1) 
            const tr = document.createElement("tr")
            tbody.appendChild(tr)
            let td = document.createElement("td")
            tr.appendChild(td)
            td.textContent = id
            td.setAttribute("scope", "row")
            td = document.createElement("td")
            tr.appendChild(td)
            td.textContent = customer.lastName
            td = document.createElement("td")
            tr.appendChild(td)
            td.textContent = customer.firstName
            td = document.createElement("td")
            tr.appendChild(td)
            td.textContent = customer.middleName            
            td = document.createElement("td")
            tr.appendChild(td)
            td.textContent = customer.phoneNumber            
                       
        });
    })