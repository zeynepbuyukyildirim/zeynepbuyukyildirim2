PGDMP     &    1                x            ikincielsatis    13.0    13.0     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    25204    ikincielsatis    DATABASE     j   CREATE DATABASE ikincielsatis WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE ikincielsatis;
                postgres    false            �            1259    25229    kategori    TABLE     o   CREATE TABLE public.kategori (
    urun_id integer NOT NULL,
    kategoriadi character varying(20) NOT NULL
);
    DROP TABLE public.kategori;
       public         heap    postgres    false            �            1259    25209 	   kullanici    TABLE     �   CREATE TABLE public.kullanici (
    id integer NOT NULL,
    isim character varying(20) NOT NULL,
    kullaniciadi character varying(30) NOT NULL,
    adres text NOT NULL,
    telno bigint NOT NULL,
    eposta character varying(30)
);
    DROP TABLE public.kullanici;
       public         heap    postgres    false            �            1259    25205    kullanici_id_seq    SEQUENCE     �   CREATE SEQUENCE public.kullanici_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.kullanici_id_seq;
       public          postgres    false    202            �           0    0    kullanici_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.kullanici_id_seq OWNED BY public.kullanici.id;
          public          postgres    false    200            �            1259    25207    kullanici_telno_seq    SEQUENCE     |   CREATE SEQUENCE public.kullanici_telno_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.kullanici_telno_seq;
       public          postgres    false    202            �           0    0    kullanici_telno_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.kullanici_telno_seq OWNED BY public.kullanici.telno;
          public          postgres    false    201            �            1259    25239    satis    TABLE     �   CREATE TABLE public.satis (
    urun_id integer NOT NULL,
    satici character varying(20) NOT NULL,
    alici character varying(20) NOT NULL,
    satinalinanesya character varying(30) NOT NULL
);
    DROP TABLE public.satis;
       public         heap    postgres    false            �            1259    25219    urun    TABLE     �   CREATE TABLE public.urun (
    kullanici_id integer NOT NULL,
    urunadi character varying(20) NOT NULL,
    fiyat integer NOT NULL,
    marka character varying(20)
);
    DROP TABLE public.urun;
       public         heap    postgres    false            1           2604    25212    kullanici id    DEFAULT     l   ALTER TABLE ONLY public.kullanici ALTER COLUMN id SET DEFAULT nextval('public.kullanici_id_seq'::regclass);
 ;   ALTER TABLE public.kullanici ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    200    202    202            2           2604    25213    kullanici telno    DEFAULT     r   ALTER TABLE ONLY public.kullanici ALTER COLUMN telno SET DEFAULT nextval('public.kullanici_telno_seq'::regclass);
 >   ALTER TABLE public.kullanici ALTER COLUMN telno DROP DEFAULT;
       public          postgres    false    201    202    202            �          0    25229    kategori 
   TABLE DATA           8   COPY public.kategori (urun_id, kategoriadi) FROM stdin;
    public          postgres    false    204   $       �          0    25209 	   kullanici 
   TABLE DATA           Q   COPY public.kullanici (id, isim, kullaniciadi, adres, telno, eposta) FROM stdin;
    public          postgres    false    202   X       �          0    25239    satis 
   TABLE DATA           H   COPY public.satis (urun_id, satici, alici, satinalinanesya) FROM stdin;
    public          postgres    false    205   �       �          0    25219    urun 
   TABLE DATA           C   COPY public.urun (kullanici_id, urunadi, fiyat, marka) FROM stdin;
    public          postgres    false    203   1       �           0    0    kullanici_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.kullanici_id_seq', 1, false);
          public          postgres    false    200            �           0    0    kullanici_telno_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.kullanici_telno_seq', 1, false);
          public          postgres    false    201            8           2606    25233    kategori kategori_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.kategori
    ADD CONSTRAINT kategori_pkey PRIMARY KEY (urun_id);
 @   ALTER TABLE ONLY public.kategori DROP CONSTRAINT kategori_pkey;
       public            postgres    false    204            4           2606    25218    kullanici kullanici_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.kullanici
    ADD CONSTRAINT kullanici_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.kullanici DROP CONSTRAINT kullanici_pkey;
       public            postgres    false    202            :           2606    25243    satis satis_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.satis
    ADD CONSTRAINT satis_pkey PRIMARY KEY (urun_id);
 :   ALTER TABLE ONLY public.satis DROP CONSTRAINT satis_pkey;
       public            postgres    false    205            6           2606    25223    urun urun_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.urun
    ADD CONSTRAINT urun_pkey PRIMARY KEY (kullanici_id);
 8   ALTER TABLE ONLY public.urun DROP CONSTRAINT urun_pkey;
       public            postgres    false    203            ;           2606    25224    urun fk_kullanici_id    FK CONSTRAINT     |   ALTER TABLE ONLY public.urun
    ADD CONSTRAINT fk_kullanici_id FOREIGN KEY (kullanici_id) REFERENCES public.kullanici(id);
 >   ALTER TABLE ONLY public.urun DROP CONSTRAINT fk_kullanici_id;
       public          postgres    false    202    2868    203            <           2606    25234    kategori fk_urun_id    FK CONSTRAINT     {   ALTER TABLE ONLY public.kategori
    ADD CONSTRAINT fk_urun_id FOREIGN KEY (urun_id) REFERENCES public.urun(kullanici_id);
 =   ALTER TABLE ONLY public.kategori DROP CONSTRAINT fk_urun_id;
       public          postgres    false    204    203    2870            =           2606    25244    satis fk_urun_id    FK CONSTRAINT     x   ALTER TABLE ONLY public.satis
    ADD CONSTRAINT fk_urun_id FOREIGN KEY (urun_id) REFERENCES public.urun(kullanici_id);
 :   ALTER TABLE ONLY public.satis DROP CONSTRAINT fk_urun_id;
       public          postgres    false    2870    205    203            �   $   x�3�,I<:���.#��2��T�Ģ�D�=... ���      �   �   x�3��M-*Qpv�s����M9�2��OI�455506�0�4K$'V�%V9��&f��%��rqF�V�(8�yx�w����g��/gX�М�71'��2h��������T�23'%�(3ɴ=... ?.Q      �   8   x�3�J��K-Pp:<'���HO� O_N�Ԣ��ʲ�*�ĢĤD�=... ���      �   -   x�3�L,JLJ�42 N���.#��2NS��K���E\1z\\\ �w
�     