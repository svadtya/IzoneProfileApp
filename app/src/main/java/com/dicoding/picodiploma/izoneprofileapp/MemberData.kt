package com.dicoding.picodiploma.izoneprofileapp

object MemberData {
    private val memberNames = arrayOf("Eunbi",
    "Sakura",
    "Hyewon",
    "Yena",
    "Chaeyeon",
    "Chaewon",
    "Minju",
    "Nako",
    "Hitomi",
    "Yuri",
    "Yujin",
    "Wonyoung")

    private val memberFullNames = arrayOf("Kwon Eun-Bi (권은비)",
    "Miyawaki Sakura (宮脇 咲良)",
    "Kang Hye-Won  (강혜원)",
    "Choi Ye-Na (최예나)",
    "Lee Chae-Yeon (이채연)",
    "Kim Chae-Won (김채원)",
    "Kim Min-Ju (김민주)",
    "Yabuki Nako (矢吹奈子)",
    "Honda Hitomi (本田仁美)",
    "Jo Yu-Ri (조유리)",
    "Ahn Yu-Jin (안유진)",
    "Jang Won-Young (장원영)")

    private val memberRank = intArrayOf(7,
    2,
    8,
    4,
    12,
    10,
    11,
    6,
    9,
    3,
    5,
    1)

    private val memberRoles = arrayOf("Leader, Main Dancer, Lead Vocalist",
    "Visual, Vocalist, Rapper",
    "Lead Rapper, Vocalist, Visual",
    "Main Rapper, Lead Vocalist, Lead Dancer",
    "Main Dancer, Lead Vocalist, Lead Rapper",
    "Lead Vocalist, Lead Dancer",
    "Lead Rapper, Vocalist, Visual",
    "Vocalist, Smol Bean",
    "Lead Dancer, Vocalist, Rapper",
    "Main Vocalist",
    "Lead Vocalist, Lead Dancer",
    "Center, Lead Dancer, Maknae, Vocalist, Rapper")

    private val memberBirthday = arrayOf("September 27, 1995",
    "March 19, 1998",
    "July 5, 1999",
    "September 29, 1999",
    "January 11, 2000",
    "August 1, 2000",
    "February 5, 2001",
    "June 18, 2001",
    "October 6, 2001",
    "October 22, 2001",
    "September 1, 2003",
    "August 31, 2004")

    private val memberZodiac = arrayOf("Libra",
    "Pisces",
    "Cancer",
    "Libra",
    "Capricorn",
    "Leo",
    "Aquarius",
    "Gemini",
    "Libra",
    "Libra",
    "Virgo",
    "Virgo")

    private val memberHeight = arrayOf("160 cm (5\'3\")",
    "163 cm (5\'4\")",
    "163 cm (5\'4\")",
    "162 cm (5\'3\")",
    "165 cm (5\'4\")",
    "163 cm (5\'3\")",
    "163.8 cm (5\'4\")",
    "149.9 cm (4\'11\")",
    "158 cm (5\'2\")",
    "162 cm (5\'4\")",
    "168.6 cm (5\'7\")",
    "171 cm (5\'7\")")

    private val memberWeight = arrayOf("46 kg (101 lbs)",
    "43 kg (94 lbs)",
    "43 kg (95 lbs)",
    "45 kg (99 lbs)",
    "47 kg (104 lbs)",
    "42 kg (92 lbs)",
    "45 kg (99 lbs)",
    "40 kg (88 lbs)",
    "44.4 kg (98 lbs)",
    "45 kg (99 lbs)",
    "48 kg (106 lbs)",
    "47 kg (104 lbs)")

    private val memberBloodType = arrayOf("A",
    "A",
    "B",
    "A",
    "A",
    "B",
    "AB",
    "She doesn\'t know",
    "A",
    "AB",
    "A",
    "O")

    private val memberHobby = arrayOf("Running, shopping",
    "Reading, watching movies, acting",
    "Anime, cartoons and drama",
    "Reading comic books and watching movies alone",
    "Reading comic books and watching movies alone",
    "Watching movies and choreography videos, eating and listening to ballads",
    "Walking, photography, watching sitcoms and going to amusement parks",
    "Eating Choco Pie and sweet food",
    "Watching cooking videos",
    "Singing, Guitar, Keyboard, Drums",
    "Shopping in Gangnam",
    "Playing with her sister at home")

    private val memberSpeciality = arrayOf("Guitar, Dancing, Impersonations, Art",
    "Able to sleep anywhere",
    "Guitar, Piano",
    "Games and claw machines",
    "Choreography",
    "Singing, dancing and eating spicy foods",
    "Guitar and imitating faces of animals",
    "Ballet, Fast Braiding",
    "Basketball, Composing Song",
    "Singing, Guitar, Keyboard, Drums",
    "Singing, Guitar, Keyboard, Drums",
    "English, Hip Hop")

    private val memberColor = arrayOf("Purple",
    "Pastel Pink",
    "Coral",
    "Yellow",
    "Mint Blue",
    "Mint Green",
    "White",
    "Sky Blue",
    "Peach",
    "Mint Green",
    "Blue",
    "Pink")

    private val memberFacts = arrayOf("- Debuted in the group Ye-A with her stage name being ‘Kazoo’ (2014-2015)\n- Her looks resembles Red Velvet’s Irene\n- Featured in Infinite’s Dongwoo’s ‘Embedded in mind’ M/V\n- Fan of IU\n- Named as the ‘Mom’ of IZ*ONE",
    "- She is in Kami7, the group of the 7 most popular members from AKB48, SKE48, NMB48, HKT48, NGT48 and STU48\n- She is a fan of Irene from Red Velvet and a Reveluv\n- First center of Produce 48\n- Loves to drink green tea latte",
    "- Nicknamed the Innocent Rapper for her pure and innocent looks\n- Attends the same school as member Yena\n- Her dog is named Zeze\n- Almost made her debut in DAYDAY and TheArk",
    "- Happy Virus of IZ*ONE\n- Her older brother is the former member of SPEED, Choi Sungmin\n- She attends the same school as fellow member Hyewon\n- Fan of SISTAR’s Bora",
    "- She participated in SIXTEEN (TWICE were the winners)\n- Her younger sister, Chaeryeong also participated in SIXTEEN (now a ITZY member)\n- Her dog is named Chaeri (seems like Chae runs in her family)\n- She speaks Japanese\n- Closest to Sakura in IZ*ONE\n- Friends with TWICE members (from SIXTEEN), fromis_9’s Jiwon and Wanna One’s Daehwi\n- Named as the ‘Father’ of IZ*ONE",
    "- Nicknamed ‘Angel ‘ and ‘Fairy’  Chaewon\n- Featured in Golden Child’s ‘Let Me’ M/V\n- Fan of  Taeyeon from SNSD",
    "- Nicknamed ‘Min Min’ (by Kriesha Chu) and Pepe (the green frog in the meme)\n- She attends the Seoul School for Performing Arts (SOPA)\n- Featured in Krisha Chu’s ‘Fallen Star’ M/V\n- Fan of Harry Potter",
    "- Shortest participant of Produce 48\n- Afraid of heights\n- Best in Korean out of all Japanese members in IZ*ONE\n- Went from Rank F to A in Produce 48\n- Fan of Jihyo of TWICE\n- Got her cute dimples from her mother",
    "- Nicknamed: ‘Strawberry Princess’, ‘Hii-Chan’ and Ppang Tomi (Bread Hitomi)\n- Can do backflips as she was a cheerleader in elementary school\n- Loves eating strawberries",
    "- She is from Busan, Korea\n- Joined Idol School (another survival tv program)\n- Close to all fromis_9 members\n- She resembles former I.O.I member and Weki Meki member Choi Yoojung",
    "- ‘Vitamin’ of IZ*ONE\n- She appeared in a CF prior joining Produce 48\n- Featured in Soyou & Baekyun‘s “Rain” M/V, Jeong Sewoon‘s “Just U” MV, Ailee & Mad Clown’s “Thirst” M/V and Yoo Seungwoo & Sandeul’s “Oppa” M/V",
    "- Nicknamed ‘Giant Baby’,  ‘Giant Maknae’, ‘Born to be Centre’\n- She is of Chinese / Taiwanese descent\n- She speaks English\n- Featured in YDPP’s M/V\n- Complimented for her long legs")

    private val memberAgency = arrayOf("Woolim Entertainment",
    "EMI Records (HKT48)",
    "8D Creative",
    "YUEHUA Entertainment",
    "WM Entertainment",
    "Woolim Entertainment",
    "Urban Works",
    "EMI Records (HKT48)",
    "Kings Records (AKB48)",
    "Stone Music Entertainment",
    "Starship Entertainment",
    "Starship Entertainment")

    private val memberImages = intArrayOf(R.drawable.img_eunbi,
    R.drawable.img_sakura,
    R.drawable.img_hyewon,
    R.drawable.img_yena,
    R.drawable.img_chaeyeon,
    R.drawable.img_chaewon,
    R.drawable.img_minju,
    R.drawable.img_nako,
    R.drawable.img_hitomi,
    R.drawable.img_yuri,
    R.drawable.img_yujin,
    R.drawable.img_wonyoung)

    private val debutImages = intArrayOf(R.drawable.debut_eunbi,
    R.drawable.debut_sakura,
    R.drawable.debut_hyewon,
    R.drawable.debut_yena,
    R.drawable.debut_chaeyeon,
    R.drawable.debut_chaewon,
    R.drawable.debut_minju,
    R.drawable.debut_nako,
    R.drawable.debut_hitomi,
    R.drawable.debut_yuri,
    R.drawable.debut_yujin,
    R.drawable.debut_wonyoung)

    val listMember: ArrayList<Member>
        get() {
            val list = arrayListOf<Member>()
            for (position in memberNames.indices) {
                val member = Member()
                member.name = memberNames[position]
                member.fullName = memberFullNames[position]
                member.rank = memberRank[position]
                member.role = memberRoles[position]
                member.birthday = memberBirthday[position]
                member.zodiac = memberZodiac[position]
                member.height = memberHeight[position]
                member.weight = memberWeight[position]
                member.bloodType = memberBloodType[position]
                member.hobby = memberHobby[position]
                member.speciality = memberSpeciality[position]
                member.color = memberColor[position]
                member.facts = memberFacts[position]
                member.agency = memberAgency[position]
                member.photo = memberImages[position]
                member.debut = debutImages[position]
                list.add(member)
            }
            return list
        }
}