// /*
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//  */
// package com.fatec.at1nutrapp;

// /**
//  *
//  * @author fatec-dsm2
//  */
// public class ProjetoIntegrador{
 
//     //Sobre o projeto
//     private String nomeProj;
//     private String ap;
    
//     //Sobre ODS
//     private String numODS;
//     private String ODS;
    
//     //Sobre os membros
//     private String nomeEquipe;
//     private String[] nomes;
 
//     private ProjetoIntegrador(Builder builder) {
//         this.nomeProj = builder.nomeProj;
//         this.ap = builder.ap;
//         this.numODS = builder.numODS;
//         this.ODS = builder.ODS;
//         this.nomeEquipe = builder.nomeEquipe;
//         this.nomes = builder.nomes;
//     }
 
//     public String getNomeProj() {
//         return nomeProj;
//     }
 
//     public String getAp() {
//         return ap;
//     }
 
//     public String getNumOds() {
//         return numODS;
//     }
 
//     public String getOds() {
//         return ODS;
//     }
 
//     public String getNomeEquipe() {
//         return nomeEquipe;
//     }
 
//     public String[] getNomes() {
//         return nomes;
//     }
 
//     public static class Builder {
 
//         private String nomeProj;
//         private String ap;
//         private String numODS;
//         private String ODS;
//         private String nomeEquipe;
//         private String[] nomes;
 
//         public Builder nomeProj(String nomeProj) {
//             this.nomeProj = nomeProj;
//             return this;
//         }
 
//         public Builder ap(String ap) {
//             this.ap = ap;
//             return this;
//         }
 
//         public Builder numODS(String numODS) {
//             this.numODS = numODS;
//             return this;
//         }
 
//         public Builder ODS(String ODS) {
//             this.ODS = ODS;
//             return this;
//         }
 
//         public Builder nomeEquipe(String nomeEquipe) {
//             this.nomeEquipe = nomeEquipe;
//             return this;
//         }
 
//         public Builder nomes(String[] nomes) {
//             this.nomes = nomes;
//             return this;
//         }
 
//         public ProjetoIntegrador build() {
//             return new ProjetoIntegrador(this);
//         }
//     }
// }