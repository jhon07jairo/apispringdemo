
# MVC API SpringBoot Proyect

MVC API SpringBoot Proyect, with .WAR generated demo-0.0.1-SNAPSHOT.war


## API Reference
![API](https://lh3.googleusercontent.com/pw/ABLVV84aRsY567alspOxlTZmikJBKB_Vw2EycNgy7Wbdvzw3hbvTerCJFQk-tYUw6CsG3wggm2qbFYcSd6jhiF7559p4AgDbw0kUZht4GqxQjZ-mQjKjwvD9jeo3zgb6jRJb9vVz_q3rz7j6LnlSPKRviC7gY9mREfTqCC7bOd22ooV7ikf9Uqx06MHIExKfc2WNya27xYdJ7J9zhTJcgg7qWdrVZNPy43c4tYuRPNBFRreNWJy9DRbrkn-ulaM0fcvCviuh_4yOkRJPauqgoLKk9mIPxpkbQbSikelFoJK33GZq94jwwqBNTq0ZU1bFNGyau4Qj3aRTZRDOpe1ByJnp2SU4KvrEOqUtdDy3LnkVztZr6nbajCVgZ2aKkY7tM3AN-lW4Hz3UMJkstywOMLM3Puq7xE50M8ZLW1RwlSfnlUAa2muTXzgS7rWDuymHojJIBexhx7ZqK_HJpb0ifGM_3VX57bm1Bf1qk0_FlFEWmOda2eWkzgt1TRB6bKgS5fMFfTVkRz800zEzOFc7nhG7ncGAlEOxDZALCogXFOB1yUlEFiGyVp9_66AR-gwGb87JPlfxOZnVviIUXpF1A2STgRp_aiMbw84nyONkeaUJzaJ1hkSxZsp2aealBfP301lPWpqYReNnYJwHLp6mOR-8yQGDLmVcjcEo4vin7fUCaryGelSqqIN9GK45PfAlgSLTTLfk_Y8qAXTcGYLaA9t484Aq_GcPoiJew1tDBOT5dZ_y5VuyJkJbb3OzpQ2mG-YAgBgWwoljxVQ1ALW19ueH53R9lrWKmpMBa6oYZI4IKGbtpdAvQordQc47vxPoC5FUJkHkeIMixRMyDA2E7rpAoN9eolCXPNeO15q2Ld4tqAAqMKK7w8rGwmKCN1vXtihGqi3Uyos9B_c8cAPe_zXwz0xihJU7=w517-h42-s-no-gm?authuser=0)

#### Get all employees

```http
  GET http://localhost:8081/employees
```
![getall(https://lh3.googleusercontent.com/pw/ABLVV84g2yq3OwYOR8LSMOPYVpknY2bcdjrmwhIR5RyId1U7gKXxoNyaSMZ6pZGX052Jab35PFhed9qsKf2yjNjS_24YBx8K2eyMBBr8tc2agDTuwTRC3rlpVFbk_ZI5P4Kr6mZTkTbM66ktPTEgNkXwf0fMbX1VPFuErTImg5gRaUpf96jSmcBRka2gLvHqFjpWoIx9RHxTnNvQBOGsP6GM2FhazZKc3vtFPKpeaZTpehd1IGzteLJzAieLgr7J3vfCJ9M527UQ2N-tyPo_WiiKYg11DWtGwbVw_ymxtHd41TZuypkckfs9_XZdelJszU901iZf2YQg8BLz7c0Fyuw4TFbKnKd5Uh4j0bDliQhhD0qSDDLl8v-CLhkHa6uGuvFgMQ0IT4XQVO4bzGGJNOXwY8MLgu1qXjzkl69GVPEmzpQHtOnAr-_bw1CMqpXFlqsu47H_RGFh0ehHDJkZsTVPfHLsS6mz5Pt1ICDqzFbidx9YFPKevnZOxsveF921M1TkP4exJA08ZzrZsXRTPLM2p00Kz8j4pk-hBBdQpHpwvFRO4cMTXTGj_8PfXdMOXRZCzahsLyaKNnnPEG9JnGYhm3TwhSYCS7g6KFBX5AATeviKUWQ7C0_U8Sr6rZItCNfuXM8lDbTHVGYp8XOifuGi1hudoBCi-lnSoBZ7JEG1u152srV1aIne1D3TI87nCAiNvYwLBWNHd7DrAtdCs9P4AqnMhGyKnTxOb-8K32GzCzWhIgU0hfXSr7UUB8O6bpLoXEJUQLDbs02yYww0_xQtniht5ZV7iauAAZ4ZsB7iNte8EGDpFJkQzKZD0xG-bZ_gAhoU-MACL-gO2JIq-lbN5j8Xh8IWajnDp5xwvHm-QfNPETrF9__uSBj3P3Nzyjz-GD5aDZ9T9L91_rs9p1CauKAh78fx=w942-h555-s-no-gm?authuser=0)

#### Get employee by id

```http
  GET http://localhost:8081/employee/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of employee to fetch |

![getid](https://lh3.googleusercontent.com/pw/ABLVV85Uy9lRCIMSYznolZoy80Ot5tjuAvLkaR4hR9s6gKrECZ1MbOHV-VVEgcMD4cLzgs3sEyfn8oVo-Gc-NZN6hJoTnVdiuWrpKA9kYr_RdpT6hqbhL5vfKbBMWu5ivz10tf5gUMo-ZmH_DDF5RmSDtf-8kgR9-gN1XXqI07Ml_96mw2m7RXdp9xKQfDRQAgWx3uauFbVI7jCWMSAGaWLG2aix_zDTXadTKy6czXKyDg56NDG7RH9atBoXASgkle6bFP8rXbWQwDqDmfeUX7uCbAgnwbR90aXeWH77ymQUqwyvTBnzSkkAixlCPP6UvBELsUH0ELNNTLjbCavPytbwsNA1wX6amYyfJ-Lhp205Y6lu2JngZ5rgUj7YdPJm559BAtcGmvbw_Hlcqp0rXxFWP73X09fM4vt_TnRnvG0C0jtcO9Pt9tyU8dYznynz4pY3rGWE4wt3OX9wAyqKspvrM6bQEmJDVp8T-8Z9nNe7wVvonPeCaukpub5EJIigJ5idA6II155MCLRBTYflPtg8LWOD7RSsyx8nPKNwVrjizsiV-SIJB-RyM0fj4HAUlCIPBh10GQ9b-YB05rUVJaMGTJyp0oMtQSJQ4BiYQxqLxwoh6EiVogCX3AGfhoeIOYfui-pIIHj5NQCAjUDDFxCLjL76AnTZcKRhBfgSv-2DVHmK1O2_59Mn78i2y6o4jjhGxc3qlRvfeS-Mib_Esvytux5j0gzeUNexBEKsQeM_-aJf-H8io4RL_XFzCF2WHGDIHnKMKUa8rz2sxZ0Y0xqdwDG_e6WuAx_cwA30qpZ6x9RcSXBVTP-UCJHiKqJA7DvYNApjG5Yw79_Qr9oGY-pgvLl2JD9O4sdvNwCz0sSxFhUVYkvpc_-iSVvFt9WebAVnnA6I_Xti7rtMF5TwzNh_PjNrYwlw=w930-h442-s-no-gm?authuser=0)



## Deployment - Build

To deploy this project run, and generate .WAR

```terminal
  mvn install
```
![war](https://lh3.googleusercontent.com/pw/ABLVV85LodOW7sAmTU7DrO220PEe7z9m9HWigndO7-c0REosOrt3NzIgHAKhkeU8_DFh_34WeHK8C0svoyXnqQN0eHKrH2U-MDs_TudFRRU4TKvbM5UQMm1HUpz64Jb2-Sj-aapnMTc2v2Oa43rhmRaNdj0GJv05dSQbbzIq506F2LXSxi53XuU6OD8TeNuNVvADXkvMo7zTy5ySF9PHLExLrRtaGl-UFcxLTAht0ttNNyknnqZA-Y69i3Y5NPufrdG5gl6zaUUDuE9gBLT0CQfl6t8cK0xp-zbNoOYGr1wNSS6Yp0U77IVMUjTWKgOZnqW-orrPNosMziqCoQ70W6tVO1DhtoliCbs7UROJan2UcUOEkEKFrjDSu0krBrYS7gF7gDNtadXjVQYzhQdXB9MpoObYPcTlDBeljQtuYH8exDoNwk_V_6A7oqaX3MUpkhfZ24qHQQh2WFcKIUZBmie9ONjzBWpM9JdpXcENISoWz6_lniTtVr1i3mPr4CVKnUFW15MbPBVweSc8BmjDSYgBlbXA_KKseq53qGj255XyQrDlWY7hqmcQVo-CfqMXdmvlAFCPomtLpnjmFNE6hmiNkOc4qUED5LKlPm6fblmnUt2fHFuIwOkPC3LkLbPoaO00-uEWjqujU6JP2wSPe9549EQ6oOEog-BC4ALoDMNflzdUguJ0fPx9j38puCT2uebl0f-BzcREc1YQsDjAfFvnWRRrTRi9N3xqn8jW3EOMHay6u8pUfhBHTtPNH6HGGZfMKRUo_tMeO4UtHlS7K1D1Mr2wcPPP8FqBvE_Lvb9eLWCqWC4CGmALfdcvoqVCaRXeCWkl2iTsnBOv_OZ5UjUxxWEHk4Ud22hiX-Me0heDUgLNnrSntlg3ybfwMK4ErIkBkNvN0BKUHnTxGUj6ZjfVsIpaqIn9=w325-h266-s-no-gm?authuser=0)

## Running Tests

AAA test pattern:

To run tests JUnit5: test getAnnualSalary()

...src/test/java/com/apiexample/demo/model/EmployeeTest.java

**Path:**

![test1](https://lh3.googleusercontent.com/pw/ABLVV85c0fyqa_m22aUUkklHtOhlg8DoUYLccQRKrQQiX-KA7PKvuExGSb82gTbI3LCl3u2KsAJG_lcKXE4dmqqa0ZLJund1_kAAoHBiiQ-Urb3zLQ7lLZ0cQJLncAtHujT0ou0xa_V1QuhgW6mlVKLkjD7-f5IqAST2g7ZLTXjZNsCTkR7RCO9GI_JTuxumGBiMfo3dJLSM-2lqxdK4kmPcWTkj7xOdAMAdZLexxfYZUzlsg2Tm7olmpYupq6xeXxOkqKz7Ut7BslXWEzgrOSRgp9ujRTB2erNG8i6eGmLXLdUsap2GV8vlO1ybJ9Q3BLgY0Ff4jU_u-GQbJVhwc2OqHDdwQSqZ7HMlWp7J4uxEB-yVtRPanYPCf5ey2aA5Q4lvNt1iFeJpOMkxLOuSc853dtk3C3F3qN4b0CQUCb5u9VzueZTRjzRYjqbav6poptcKf_TrQZO-BnH9zHV0lpypvwFCuE8mvy7jIdEP7gATqgr0A3BEgCAy9tZApgjDzhdunl-K65rj8EwFefFdzjy7DcnggiGAFb7gy0oYaaKJWzi5gvXp2WN1GDhbcQnRu2wA3vzg9TN0k3s9ggNXCD6q4LqZQaEcmDz8yOvb1nIOFdCAkMt4E85GBIgrLeeA4ygbneZNYyKVxkl8lzy0t3danJljIIG9W0Irgf_z2CU74lUcHXwhWLDw_s8leInMkcEN9QiBlM6pPzH0ztgy-y_Q2_bE0iUWNBOvLisqAYxD7wthLpLOL5fF0-lnucAojdI09VWD59HI7spYcWm77VqWsA3DZP8lCsequ9WLp06c_61hTys7hRIbP3HwY_whoCQr7GrdOkALZKta3wh4nqu7mraBY4A8q5QgazL1zu2H7RbbMxAxKjMlMd4Jus2M08OdZBNT_gNf-Cl4lG5XUBNNUOd3IPSQ=w323-h91-s-no-gm?authuser=0)

**Test Correcto:**
![test2](https://lh3.googleusercontent.com/pw/ABLVV84d3RgLec442_VF5eRr5AvzqEFo2-M5XV7On491cdFiF0efn05-bx9LJf3G-n9LE2kys1Fc9SYqXQulhmr5-0atn3Q85Fv8b2NQj9dWavpOw4ol2t05WjfAwo_IbAmNetbzela7gv23Tp_Vy1XujGCzqSlzv1GLQFj2wPLUirLc1cZi8HFPl7zcTYEEJAA9bXKISCrRCVkdHpDQYLUgWJjsDhjRohU7mkDAlO12aAYhrDoPlSrt8ke08JY5Sqq8Nornbpn9PHFQ5_V_P8nVc4wpdcPhcrbnJi8JyUQL-oS7YOJptGxdacttYKetAfGKpO99OP6GWjpQgEN0Wv98D0EnKQatw46g8RBxAU_L8WGNQ5uUENqnlYMyrV9hTqhmCBjgnqMh77cJwL5alkCUbKgo6Yw3uZt4AdAM-gEqPsH5wrUHucmXBsVcUaBOhkKlYRqBQq3jNfkDKOTiZIQzZSAy9-hJS8oWDAja5uJMslUDqdTe1eeZX8rVhHyLGYjjeHQQZ24XXK3HRZvY6yucpZhbxN2ZRsbTwbmcq1MEuZZa4pflaAX3MbeCR-BXlOj6vO1Xw4KcEkT1Dw9QOUubh2VQipEU0WvBP3gKwnOw4L7uB3jw2uNhhpxsK1EeEii90RNzhjRxseHE4OMw23tsm-gmf5wMt_YX7umC7CyRp5jTUUbVCzq7BeYieabaAP55fufs3ouzRfQDFnntDagVDqclMrl-_mkEk2pNPU-vbfPCsfwwfEQQmgsvpCw6FbykzNnFVN_mrHbqamsQuY-CcH4UmKmJQ9IK8u5iy4w_9FZckSD1BefdwHCK7nWXUQ5fXA-5dZ5k7wXIoP4m9D1iviCrMR6bS0fgb6uFsbdL5o2ARmwGD5lOyk4oeZRT7vgJ3gWmQGjwcvcY72jgT7N6w28NTWBR=w1024-h446-s-no-gm?authuser=0)

**Test Correcto Notificación:**

![test3](https://lh3.googleusercontent.com/pw/ABLVV85FRp9wvabfEN14jf_cZJ8L8Rfa1pl_6vO3LFngmoYMBD4uoNxnYJWsijfC9jPm6UFXjXOQTFjMPrJdjvAt0nzxexui0KkmW0nzuPLR7pbtZiYIC-U4tl9aCGZ_DkNkpTieDtCQgiz0Yr_y5wwNJbuX7h8xgvYKCgXQ6edgo9r_5noiCxRrtjnyUerOchOoLMLGFdr4C0_zpPqZ8tBoE2LSyF1L4ZKsJc8zt9f5iwrcy3wOpP8HlQ--h8rRQz8hZw2-8ctaRLYvZXc0LQO9xGWwhGJxhj2QeQ2LDTaiOaflWgig0Rw0zBsw6YnFgh0Qlb6VJXF3tmQ1nRqrF59TGJ6EMjnWuyxaE45AvCFl6bclSgJgZV174mJLozHWk-S_1OeeXdwuxIG5Jb0CuGErLfH7Ewh686c57Gtbnu2E6McmDoHIq7fELEkZzsrJlW9u2cOaXHAkWBNEarE-JsrxbMK_3nGAB8OKEoU07HqNOz7NftguczqVOYagDlIOjZTjpKVpM65gReGwafK5N4WU9ieiI0JAcgv7-4H5p0rCYflUJE32LgkamyiQTL2uwQNFTclGVOwGLottzNwf3H0LZA1FZchEzxmUHmhS6MJnjiLJquodz3lgzNoP_Kqjt_RSAjdpwksWGlWIt7yv4aNuBzo6iOt-_8Ix31KibSVnZrgiDx1Xw9fF7HWXZZMam_0WkrYdp4eNuzc5Q4hOOWtgoKsC8FnyUhzT6eM8rI9p_wgKTnjjcdlmrg8fxp7GkB4n_YpZmtnxMzWosqbkLK6LPSu7ZlDX8sznva43UQvYjt1Zn6U6hlM-XgocfUQfXoP-QqtfLd-Q-m1B6QxdLlC1SP6ds1j1l7Yh_JQw-6c0Qwotu2iEY3G5F2NI3DqqXT2xlNR98-yu51eQjN7XZ6GC426NdrM=w389-h158-s-no-gm?authuser=0)

**Test Incorrecto a propósito:**
![test4](https://lh3.googleusercontent.com/pw/ABLVV84kM_J1_4EYLpGnQw77ZTf0dmVmDneTlTGuwq5j4SIlwuf1c85IeLezipAwhwAroYkosNiDkYwZ7B8q7yHGNiVUZU5MQC5NljFLmhpHIFegllghNY5-1oe4pqlVi6ISvxCmOpQjULA1R7AGbPw49f6B7nMfI6_8iS05A1EJtMUBvpm0bpQD7-HQPOl-W7U7Po2gLsAO0M3mW_F9HoR_nlEQ63dU-4zEQC3A6PrVfeSGCjYOAI8k_5eHsmQGEox0mze8wUJi0yX8gySUfBRD37irP4qZuhB0VL0TFGTL2rVHeG5IGGE9V2GgSdw-fqVKm5i5fpIai7C-vIJTgUzBQ4NIlAthjOQL-mSYKeKIAHU2JyVPlq28OsEGJW3mmVQs7ytBdWeic-dV45U87V5hYjPD3KlmzCEmI2o-I2HpoKg_HzdqG8bPdRiEjZ9EGJYlEDayFDNOoJHAALUIymXETxQ3LArPn75sI70DHwfP6xJ2rKabmaNhcNLoN54D-ZaLf2gFvRTDIt18bYIrhUSWOqO6eB03kuZwEu-a7CnYaGf04WfDMdvrTd3yqIXC35zay6j4IPj0nXn1Fl8EMtu-GAuDWYHcYyLsNhw1huuOa4jic4tiRau9uYRAFqlLn0CpJl2m2yd5AvliwaA2Ej99knm5eeAyjpOteL96RQdhS2aF451D_HieIojmc5SJ8kINhmIasi4_Xk430ORlkscH4G60XPBimgbS_b475mDtSSlgBUpN0miiPvGCi61_Ytcb5BJ-ou9SSb1pDj7x4JFz_fhGTxpqKiPduoKVollSh91ffkDl9i-onZLeZDvgS6ayJERq4EznImaoXDzGMefcYup4n4msEywHNM9PBrgqP3sZGu2uovfjpXqf_HVdDqGZ3PxGTm0h_NPVatSjrtUxcRzgvHrq=w1024-h506-s-no-gm?authuser=0)
## Tech Stack

**Proyect:** Java 17, Framework SpringBoot 3.2.2, Maven, JUnit5, Postman, IDE IntelliJ IDEA Community Edition


## Related

Front-End Angular 17 proyect 

[angular-employees README](https://github.com/jhon07jairo/angular-employees/blob/main/README.md)

Angular WebApp link: https://app77employees77.netlify.app/


## Authors

- [@jhon07jairo](https://github.com/jhon07jairo/apispringdemo)

