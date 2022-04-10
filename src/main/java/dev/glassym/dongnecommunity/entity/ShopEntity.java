package dev.glassym.dongnecommunity.entity;

import javax.persistence.*;

@Entity
@Table(name = "shop")
public class ShopEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "owner_id")
    private UserEntity owner;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "location_at")
    private AreaEntity location;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "category")
    private CategoryEntity category;

    public ShopEntity() {
    }

    public ShopEntity(Long id, String name, UserEntity owner, AreaEntity location, CategoryEntity category) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.location = location;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserEntity getOwner() {
        return owner;
    }

    public void setOwner(UserEntity owner) {
        this.owner = owner;
    }

    public AreaEntity getLocation() {
        return location;
    }

    public void setLocation(AreaEntity location) {
        this.location = location;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }
}
