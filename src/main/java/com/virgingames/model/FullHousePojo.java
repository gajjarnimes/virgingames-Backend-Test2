package com.virgingames.model;


public class FullHousePojo {

   private  int _1;
   private  int _2;
   private  double _3;
   private  int _4;
    private String fullHouse;

    public int get_1() {
            return this._1; }
        public void set_1(int _1) {
            this._1 = _1; }


        public int get_2() {
            return this._2; }
        public void set_2(int _2) {
            this._2 = _2; }

        public double get_3() {
            return this._3; }
        public void set_3(double _3) {
            this._3 = _3; }

        public int get_4() {
            return this._4; }
        public void set_4(int _4) {
            this._4 = _4; }
         public static FullHousePojo getBingoBody(int int_1, int int_2,double double_3,int int_4){
        FullHousePojo fullHousePojo= new FullHousePojo();
        fullHousePojo.set_1(int_1);
        fullHousePojo.set_2(int_2);
        fullHousePojo.set_3(double_3);
        fullHousePojo.set_4(int_4);
        return fullHousePojo;
         }
    }




