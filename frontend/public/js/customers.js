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