package org.ftclub.cabinet.cabinet.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Access(value = AccessType.PROPERTY)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CabinetPlace {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cabinetIdPlace;
    @Column(length = 32)
    private String location;
    @Column
    private Integer floor;
    @Column(length = 32)
    private String section;
    @Column
    private Integer row;
    @Column
    private Integer col;
    @Column
    private Integer mapStartX;
    @Column
    private Integer mapEndX;
    @Column
    private Integer mapStartY;
    @Column
    private Integer mapEndY;

    public CabinetPlace(String location, Integer floor, String section, Integer row, Integer col, Integer mapStartX, Integer mapEndX, Integer mapStartY, Integer mapEndY) {
        this.location = location;
        this.floor = floor;
        this.section = section;
        this.row = row;
        this.col = col;
        this.mapStartX = mapStartX;
        this.mapEndX = mapEndX;
        this.mapStartY = mapStartY;
        this.mapEndY = mapEndY;
    }
}
