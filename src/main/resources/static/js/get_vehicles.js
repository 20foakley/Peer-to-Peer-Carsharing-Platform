async function populateVehicleListings() {
    const response = await fetch('/api/vehicles');
    const vehicles = await response.json();
    const container = document.getElementById('vehicle-listings');

    vehicles.forEach(vehicle => {
        const listing = document.createElement('div');
        listing.classList.add('vehicle-listing');
        listing.innerHTML = `
            <div class="vehicle-image">
                <img src="${vehicle.image}" alt="Vehicle Image">
            </div>
            <div class="vehicle-details">
                <h3 class="listing-title">${vehicle.title}</h3>
                <p class="owner-name">Owner: ${vehicle.owner}</p>
                <p class="location">Location: ${vehicle.location}</p>
                <ul class="vehicle-specs">
                    <li><strong>Make:</strong> ${vehicle.make}</li>
                    <li><strong>Model:</strong> ${vehicle.model}</li>
                    <li><strong>Submodel:</strong> ${vehicle.submodel}</li>
                    <li><strong>Year:</strong> ${vehicle.year}</li>
                    <li><strong>MPG:</strong> ${vehicle.mpg}</li>
                    <li><strong>Doors:</strong> ${vehicle.doors}</li>
                    <li><strong>Fuel:</strong> ${vehicle.fuel}</li>
                    <li><strong>Power:</strong> ${vehicle.power}</li>
                    <li><strong>Transmission:</strong> ${vehicle.transmission}</li>
                </ul>
                <p class="listing-description">${vehicle.description}</p>
                <div class="availability-calendar"></div>
            </div>
        `;
        container.appendChild(listing);

        $(listing).find('.availability-calendar').fullCalendar({
            events: vehicle.availability //fetch availability data if it's in a separate endpoint
        });
    });
}

document.addEventListener('DOMContentLoaded', populateVehicleListings);
