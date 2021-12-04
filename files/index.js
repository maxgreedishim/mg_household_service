fetch('api/mg_household_service?page=0')
    .then(res => res.json())
    .then(obj => {
        const ol = document.querySelector("ol")
        const columns = obj._embedded.columns
        columns.forEach(column => {
            const p = document.createElement("li")
            p.textContent =  `
             ${column.end_date},
             ${column.notes},
             ${column.price},
             ${column.start_date},`
            ol.appendChild(p)
        });
    })