fetch('api/mainbase?page=0')
    .then(res => res.json())
    .then(obj => {
        const ol = document.querySelector("ol")
        const customers = obj._embedded.customers
        customers.forEach(customer => {
            const p = document.createElement("li")
            p.textContent =  `
             ${customer.first_name},
             ${customer.last_name},
             ${customer.middle_name},
             ${customer.phone_numder}`
            ol.appendChild(p)
        });
    })