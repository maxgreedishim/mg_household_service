fetch('/api/doctors?page=0')
    .then(res => res.json())
    .then(obj => {
        const ol = document.querySelector("#doctors")
        const doctors = obj._embedded.doctors
        doctors.forEach(doctor => {
            const p = document.createElement("li")
            p.textContent = `Прием ведет доктор ${doctor.lastName}, ${doctor.firstName}, ${doctor.middleName}, ${doctor.specialization}`
            ol.appendChild(p)
        });
    })