package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;

    //프록시나 리플랙션 (없으면 사용불가)/값타입은 변경 불가능하게 설계 없으면
    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
