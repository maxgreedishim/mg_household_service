fetch('api/mg_household_service?page=0')
    .then(res => res.json())
    .then(obj => {
        const ol = document.querySelector("ol")
        const customers = obj._embedded.customers
        customers.forEach(customer => {
            const p = document.createElement("li")
            p.textContent =  `${customer.lastName}, ${customer.firstName}, ${customer.middleName}, ${customer.phoneNumber}`
            ol.appendChild(p)
        });
    })