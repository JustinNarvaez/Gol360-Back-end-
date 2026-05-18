-- EQUIPOS
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Colombia', 'COL', 'https://flagcdn.com/co.svg', 'Grupo A', '6');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Brasil', 'BRA', 'https://flagcdn.com/br.svg', 'Grupo A', '6');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Argentina', 'ARG', 'https://flagcdn.com/ar.svg', 'Grupo B', '26');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Francia', 'FRA', 'https://flagcdn.com/fr.svg', 'Grupo B', '2');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Espana', 'ESP', 'https://flagcdn.com/es.svg', 'Grupo C', '9');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Alemania', 'GER', 'https://flagcdn.com/de.svg', 'Grupo C', '25');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Inglaterra', 'ENG', 'https://flagcdn.com/gb-eng.svg', 'Grupo D', '10');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Portugal', 'POR', 'https://flagcdn.com/pt.svg', 'Grupo D', '27');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Mexico', 'MEX', 'https://flagcdn.com/mx.svg', 'Grupo E', '16');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Estados Unidos', 'USA', 'https://flagcdn.com/us.svg', 'Grupo E', '1');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Canada', 'CAN', 'https://flagcdn.com/ca.svg', 'Grupo F', '3');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Marruecos', 'MAR', 'https://flagcdn.com/ma.svg', 'Grupo F', '8');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Japon', 'JPN', 'https://flagcdn.com/jp.svg', 'Grupo G', '12');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Senegal', 'SEN', 'https://flagcdn.com/sn.svg', 'Grupo G', '18');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Uruguay', 'URU', 'https://flagcdn.com/uy.svg', 'Grupo H', '17');
INSERT INTO teams (name, fifa_code, flag_url, group_phase, api_football_id) VALUES ('Ecuador', 'ECU', 'https://flagcdn.com/ec.svg', 'Grupo H', '7');

-- ESTADIOS
INSERT INTO stadiums (name, city, country, capacity, latitude, longitude, address, maps_place_id) VALUES ('MetLife Stadium', 'Nueva Jersey', 'Estados Unidos', 82500, 40.8135, -74.0745, '1 MetLife Stadium Dr', 'ChIJ1234NY');
INSERT INTO stadiums (name, city, country, capacity, latitude, longitude, address, maps_place_id) VALUES ('SoFi Stadium', 'Los Angeles', 'Estados Unidos', 70240, 33.9535, -118.3392, '1001 Stadium Dr, Inglewood', 'ChIJ1234LA');
INSERT INTO stadiums (name, city, country, capacity, latitude, longitude, address, maps_place_id) VALUES ('ATT Stadium', 'Dallas', 'Estados Unidos', 80000, 32.7478, -97.0928, '1 ATT Way, Arlington TX', 'ChIJ1234TX');
INSERT INTO stadiums (name, city, country, capacity, latitude, longitude, address, maps_place_id) VALUES ('Levis Stadium', 'San Francisco', 'Estados Unidos', 68500, 37.4033, -121.9694, '4900 Marie P DeBartolo Way', 'ChIJ1234SF');
INSERT INTO stadiums (name, city, country, capacity, latitude, longitude, address, maps_place_id) VALUES ('Estadio Azteca', 'Ciudad de Mexico', 'Mexico', 87523, 19.3030, -99.1502, 'Calz. de Tlalpan 3465', 'ChIJ1234MX');
INSERT INTO stadiums (name, city, country, capacity, latitude, longitude, address, maps_place_id) VALUES ('Estadio Akron', 'Guadalajara', 'Mexico', 49850, 20.6869, -103.4673, 'Av. Paseo de la Arboleda 1200', 'ChIJ1234GDL');
INSERT INTO stadiums (name, city, country, capacity, latitude, longitude, address, maps_place_id) VALUES ('Estadio BBVA', 'Monterrey', 'Mexico', 53500, 25.6693, -100.2435, 'Av. Pablo Livas 2011', 'ChIJ1234MTY');
INSERT INTO stadiums (name, city, country, capacity, latitude, longitude, address, maps_place_id) VALUES ('BMO Field', 'Toronto', 'Canada', 30000, 43.6333, -79.4186, '170 Princes Blvd', 'ChIJ1234TO');
INSERT INTO stadiums (name, city, country, capacity, latitude, longitude, address, maps_place_id) VALUES ('BC Place', 'Vancouver', 'Canada', 54500, 49.2767, -123.1115, '777 Pacific Blvd', 'ChIJ1234VAN');
INSERT INTO stadiums (name, city, country, capacity, latitude, longitude, address, maps_place_id) VALUES ('Hard Rock Stadium', 'Miami', 'Estados Unidos', 65326, 25.9580, -80.2389, '347 Don Shula Dr', 'ChIJ1234MIA');
INSERT INTO stadiums (name, city, country, capacity, latitude, longitude, address, maps_place_id) VALUES ('Lincoln Financial Field', 'Filadelfia', 'Estados Unidos', 69796, 39.9008, -75.1675, '1 Lincoln Financial Field Way', 'ChIJ1234PHI');
INSERT INTO stadiums (name, city, country, capacity, latitude, longitude, address, maps_place_id) VALUES ('Gillette Stadium', 'Boston', 'Estados Unidos', 65878, 42.0909, -71.2643, '1 Patriot Pl, Foxborough', 'ChIJ1234BOS');

-- CIUDADES
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('Nueva York', 'Estados Unidos', 'JFK', 40.7128, -74.0060);
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('Los Angeles', 'Estados Unidos', 'LAX', 34.0522, -118.2437);
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('Dallas', 'Estados Unidos', 'DFW', 32.7767, -96.7970);
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('Miami', 'Estados Unidos', 'MIA', 25.7617, -80.1918);
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('San Francisco', 'Estados Unidos', 'SFO', 37.7749, -122.4194);
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('Boston', 'Estados Unidos', 'BOS', 42.3601, -71.0589);
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('Filadelfia', 'Estados Unidos', 'PHL', 39.9526, -75.1652);
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('Seattle', 'Estados Unidos', 'SEA', 47.6062, -122.3321);
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('Ciudad de Mexico', 'Mexico', 'MEX', 19.4326, -99.1332);
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('Guadalajara', 'Mexico', 'GDL', 20.6597, -103.3496);
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('Monterrey', 'Mexico', 'MTY', 25.6866, -100.3161);
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('Toronto', 'Canada', 'YYZ', 43.6532, -79.3832);
INSERT INTO cities (name, country, iata_code, latitude, longitude) VALUES ('Vancouver', 'Canada', 'YVR', 49.2827, -123.1207);