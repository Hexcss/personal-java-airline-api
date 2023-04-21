package Services;

import Records.Airport;
import Utils.Interfaces.Repositories.AirportRepository;
import Utils.Interfaces.Services.AirportService;

import java.util.List;

public class AirportServiceImpl implements AirportService {
    private AirportRepository airportRepository;

    public AirportServiceImpl(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    public void saveAirports(List<Airport> airports) {
        airportRepository.save(airports);
    }

    @Override
    public List<Airport> getDestinationsByAirlineName(String airlineName) {
        return airportRepository.findByAirlineName(airlineName);
    }

    @Override
    public List<Airport> getDestinationsByAirlineCode(int airlineCode) {
        return airportRepository.findByAirlineCode(airlineCode);
    }
}
