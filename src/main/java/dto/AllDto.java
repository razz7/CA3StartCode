/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author rh
 */
public class AllDto {
    
    private String personName;
    private String planetName;
    private String planetName2;

    public AllDto(SwapiPeopleDtp personName, SwapiPlanetsDto planetName, SwapiPlanetsDto planetName2) {
        this.personName = personName.getName();
        this.planetName = planetName.getName();
        this.planetName2 = planetName2.getName();
    }

    public AllDto() {
    }
    
    
    
}
