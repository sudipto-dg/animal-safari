import java.util.Scanner;
public class Animals
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("List of Animals:");
        
        System.out.println("1.Peacock\t2.Tiger");
        System.out.println("3.Giraffe\t4.Zebra");
        System.out.println("5.Nightingale\t6.Lion");
        System.out.println("7.Crocodile\t8.Elephant");
        System.out.println("9.Chimpanzee\t10.Eagle");
        System.out.println("11.Rabbit\t12.Cat");
        System.out.println("13.Koala\t14.Dog");
        System.out.println("15.Snake\t16.Ostrich");
        
        System.out.println("Choose a name of animal from the above list:");
        int ch=sc.nextInt();
        
        System.out.println();
        
        AudioPlayer obj=new AudioPlayer();
        ShowPicture gh=new ShowPicture();
        switch(ch)
        {
            case 1:
            System.out.println("You have chosen Peacock");
            System.out.println();
            System.out.println("Scientific Name: Pavo cristatus");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("Peacocks are found in India, Pakistan, Sri Lanka, Southeast Asia and central Africa.\nThey mostly take shelter in forests and rain forests. They are 27 to 51 inches long, depending on species.\nThey feed on grain, insects, small reptiles and mammals, berries, figs, leaves, seeds and flower parts.\nMost people call them peacocks, but that's only the correct name for male of this type of bird.\n\nFemales are called peahens, and the whole group are peafowl. There are three types of peafowl in\nthe world: Indian, green, and Congo. Most people are familiar with the Indian peafowl, since that\nis the kind found in many zoos and parks. Indian peafowl live in India, Pakistan, and Sri Lanka,\ngreen peafowl are found in Southeast Asia, and Congo peafowl are from central Africa. The Indian\npeacock has some of the brightest feathers, but the peahen is a drab, mottled brown in comparison.\nThe male needs his bright feathers to attract a mate, and the female needs to be able to blend in\nthe bushes so that predators cannot see her whilef she is incubating her eggs. A group of peafowl\nis called a party or a pride! The Indian peafowl is the national bird of India and is protected in\nthat country. In the Hindu religion, the peafowl is a sacred bird, because the spots on the peacock’s\ntail symbolize the eyes of the gods.");
            obj.called(ch);
            gh.peacock();
            break;
            
            case 2:
            System.out.println("You have chosen Tiger");
            System.out.println();
            System.out.println("Scientific Name: Panthera tigris");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("Tigers are found in small areas in Asia.They take shelter in tropical rain\nforest, snow covered coniferous and deciduous forests, mangrove swamps, and\ndrier forest areas.\n\nRecognizing a tiger at the zoo is easy. But in their natural habitat, tigers\nare really hard to find. That’s because their unique orange, black and white\nstripe pattern helps them blend into the forests and grassy areas where they\nlive and hunt.Tigers are carnivores. They are quiet, patient hunters with large\npowerful paws and teeth to help them catch and eat their prey. Some of their favorite\nmeals include pigs, deer, rhinoceroses, and even small elephants. Tigers hunt for\ntheir food, but they are also hunted by humans for their valuable fur and body parts.\nBecause of this, tiger researches think there may only be 3,500 tigers left in the\nworld. This makes them an endangered species.");
            obj.called(ch);
            gh.tiger();
            break;
            
            case 3:
            System.out.println("You have chosen Giraffe");
            System.out.println();
            System.out.println("Scientific Name: Giraffa camelopardalis");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("Giraffes are mainly found in Africa and south of Sahara Desert.\nThey live in Savanna. They feed on Acacia leaves. Males are upto\n18 feet tall; females are upto 14 feet tall. Their baby calves are\n6 feet tall at birth!\n\nGiraffes are the tallest land animals. A giraffe could look into a\nsecond-story window without even having to stand on its tiptoes! A\ngiraffe's 6-foot-long neck weighs about 600 pounds. The legs of a\ngiraffe are also 6 feet long. The back legs look shorter than the\nfront legs, but they are about the same length.There is only one\nspecies of giraffe. The recognized subspecies include reticulated,\nNubian, Uganda or Baringo, Masai, Angolan, and southern. The different\nkinds can be recognized by their spots and also by where they live in\nAfrica. Masai giraffes, from Kenya, have spots that look like oak leaves.\nOther kinds have a square-shaped pattern that looks like the giraffe is\ncovered by a net. Some zoologists think that the giraffe's pattern is for\ncamouflage. Both male and female giraffes have two distinct, hair-covered\nhorns called ossicones. Male giraffes use their horns to playfully fight\nwith one another.");
            obj.called(ch);
            gh.giraffe();
            break;
            
            case 4:
            System.out.println("You have chosen Zebra");
            System.out.println();
            System.out.println("Scientific Name: Equus burchellii");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("Zebra's are found in Eastern and Southern Africa. Their habitat is on\ngrasslands and semi-deserts. They feed on grass and leaves. They are 4 to\n5 feet tall at the shoulder.\n\nZebras are members of the horse family. They have excellent hearing and\neyesight and can run at speeds of up to 35 miles per hour. Usually the lead\nmale of the herd, called a stallion, stays at the back of the group to defend\nagainst predators, if necessary.When zebras are grouped together, their\nstripes make it hard for a lion or leopard to pick out one zebra to chase.\nDifferent zebra species have different types of stripes, from narrow to wide.\nIn fact, the further south you travel on the African plains, the farther apart\nthe stripes on the zebras get! Zebras communicate with facial expressions and\nsounds. They make loud braying or barking sounds and soft snorting sounds. The\nposition of their ears, how wide open their eyes are, and whether they show their\nteeth all send a signal. For example, ears flat back means trouble, or 'you better\nfollow orders!'");
            obj.called(ch);
            gh.zebra();
            break;
            
            case 5:
            System.out.println("You have chosen Nightingale");
            System.out.println();
            System.out.println("Scientific Name: Luscinia megarhynchos");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("The common nightingale is at 15–16.5 cm (5.9–6.5 in) length. It is plain brown\nabove except for the reddish tail. It is buff to white below. Sexes are similar.\nThe song of the nightingale[2] has been described as one of the most beautiful\nsounds in nature, inspiring songs, fairy tales, opera, books, and a great deal of\npoetry. It is a migratory insectivorous species breeding in forest and scrub in\nEurope and South-West Asia, and wintering in west Africa. It is not found naturally\nin the Americas. The distribution is more southerly than the very closely related\nthrush nightingale Luscinia luscinia. It nests on or near the ground in dense vegetation.\n\nCommon nightingales are so named because they frequently sing at night as well as\nduring the day. The name has been used for more than 1,000 years, being highly\nrecognisable even in its Old English form nihtgale, which means 'night songstress'.\nEarly writers assumed the female sang when it is in fact the male. The song is loud,\nwith an impressive range of whistles, trills and gurgles. Its song is particularly\nnoticeable at night because few other birds are singing. This is why its name includes\n'night' in several languages. Only unpaired males sing regularly at night, and nocturnal\nsong is likely to serve to attract a mate. Singing at dawn, during the hour before sunrise,\nis assumed to be important in defending the bird's territory. Nightingales sing even more\nloudly in urban or near-urban environments, in order to overcome the background noise.");
            obj.called(ch);
            gh.nightingale();
            break;
            
            case 6:
            System.out.println("You have chosen Lion");
            System.out.println();
            System.out.println("Scientific Name: Panthera leo");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("The lion is one of the five big cats in the genus Panthera and a member of the family\nFelidae. The commonly used term African lion collectively denotes the several subspecies\nfound in Africa. With some males exceeding 250 kg (550 lb) in weight, it is the second-\nlargest living cat after the tiger. Wild lions currently exist in sub-Saharan Africa and\nin Asia (where an endangered remnant population resides in Gir Forest National Park in\nIndia) while other types of lions have disappeared from North Africa and Southwest Asia\nin historic times. Until the late Pleistocene, about 10,000 years ago, the lion was the\nmost widespread large land mammal after humans. They were found in most of Africa, across\nEurasia from western Europe to India, and in the Americas from the Yukon to Peru. The lion\nis a vulnerable species, having seen a major population decline in its African range of\n30–50% per two decades during the second half of the twentieth century. Lion populations\nare untenable outside designated reserves and national parks. Although the cause of the\ndecline is not fully understood, habitat loss and conflicts with humans are currently the\ngreatest causes of concern. Within Africa, the West African lion population is particularly\nendangered. In the wild, males seldom live longer than 10 to 14 years, as injuries sustained\nfrom continual fighting with rival males greatly reduce their longevity. In captivity they\ncan live more than 20 years. They typically inhabit savanna and grassland, although they may\ntake to bush and forest. Lions are unusually social compared to other cats. A pride of lions\nconsists of related females and offspring and a small number of adult males. Groups of female\nlions typically hunt together, preying mostly on large ungulates. Lions are apex and keystone\npredators, although they are also expert scavengers obtaining over 50 percent of their food by\nscavenging as opportunity allows. While lions do not typically hunt humans, some have. Sleeping\nmainly during the day, lions are active primarily at night (nocturnal), although sometimes at twilight.");
            obj.called(ch);
            gh.lion();
            break;
            
            case 7:
            System.out.println("You have chosen Crocodile");
            System.out.println();
            System.out.println("Scientific Name: Crocodylus niloticus");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("The crocodiles are the largest reptiles on Earth. They have a hard scaly skin, a long\ntail, short legs and very sharp teeth. Crocodiles live in tropical and subtropical\nAfrica, India, Southeast Asia, America and Australia in wet environments - rivers,\nlakes, coastal areas and wetlands. There are freshwater crocodiles and saltwater\ncrocodiles. Freshwater crocodiles are smaller and their teeth have identical sizes.\nMeanwhile, the saltwater crocodiles are bigger, have teeth of different sizes and\nare more dangerous to humans. In water crocodiles remain hidden underwater, the only\nthing you'll see are the eyes and nostrils. So they can breathe more easily and catch\nprey that are approaching the water. They swim very well with the help of their long\nand powerful tail. On the ground the crocodiles like to sunbathe with their mouths open\nand also make their nests. They eat small mammals, rats, snakes, antelopes, zebras, fish,\nturtles, birds, pets. They grab their prey and carry them to the bottom of the water to\ndrown. Then come to the surface of the water to eat. The mother crocodile lays her eggs\non the ground and bury them to protect them from some animals that like to eat them. The\nmother crocodile and sometimes the father crocodile stay close to the nest, protecting it.\nWhen the mother hears the sounds of baby crocodiles, she will soon dig up the eggs of the\nsand to help them hatch. Then take baby crocodiles into the water, where they will eat mostly\ninsects.");
            obj.called(ch);
            gh.crocodile();
            break;
            
            case 8:
            System.out.println("You have chosen Elephant");
            System.out.println();
            System.out.println("Scientific Name: Elephas maximus");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("Elephants are the biggest land animals in the world. The African elephant is found on\nthe continent of Africa and the Indian elephant is found in Asia. Elephants are mammals\nas well as herbivores, meaning they only eat plants rather than meat.Elephants are truly\ngigantic animals. They can grow to 11 feet tall and can weigh up to 13,000 pounds. The largest\nelephant ever was 13 feet tall and weighed 24,000 pounds! Elephants' appetites are as big as\ntheir size. They can eat up to 400 pounds and drink up to 30 gallons of water each day.Elephants\nhave many interesting features including giant ears, long tusks, and a huge trunk. Elephants flap\ntheir giant ears to cool off. Their tusks can be up to 10 feet long. Elephants use their tusks to\ndig or scrape the bark off of trees. Sometimes they use them to fight. Their tusks continue to grow\nfor their entire life.An Elephant's trunk is their most versatile appendage. Elephants use their\nlong trunks to pick up food as small as a blade of grass, but also to pull down tree branches to\nget to food. Elephants also use their trunk to drink, smell, and suck up water to spray themselves\nfor a bath.Elephants are considered very intelligent. They have very sophisticated social structures\nand methods of communication. They also are very skilled with tools and can be trained for all sorts\nof tasks. Maybe there is some truth to the saying that 'an elephant never forgets'.A baby elephant\nis called a calf. Like all mammals the babies feed off their mother's milk. They are hairy and usually\nare between two and three feet tall.Because of their size and prized ivory tusks, elephants have long\nbeen a favorite of big game hunters. Too much hunting has caused the elephant population to diminish\nrapidly. Elephants are now a protected species throughout the world.");
            obj.called(ch);
            gh.elephant();
            break;
            
            case 9:
            System.out.println("You have chosen Chimpanzee");
            System.out.println();
            System.out.println("Scientific Name: Pan troglodytes");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("Chimpanzees (sometimes called chimps) are an exclusively African species of extant great ape.\nNative to subsaharan Africa, chimpanzees are currently found in the Congo jungle.\nClassified in the genus Pan, chimpanzees were considered to be one species. However, since 1928, they have been divided into two species: the chimpanzee and the bonobo.\nIn addition, the chimpanzee is divided into five subspecies. Based on genome sequencing, the two extant Pan species diverged around one million years ago.\nThe ancestors of the Pan genus split from humans four to six million years ago.Males and females differ in size and appearance.\nChimps and bonobos are one of the most social great apes, with social bonds occurring in large communities.\nFruit is the most important component of an chimpanzee's diet; however, the apes will also eat vegetation, bark, honey, insects and even other chimps. They can live over 30 years in both the wild and captivity.\nChimpanzees are among the most intelligent primates; they use a variety of sophisticated tools and construct elaborate sleeping nests each night from branches and foliage.\nThe apes have been extensively studied for their learning abilities. There may even be distinctive cultures within populations.\nField studies of the apes were pioneered by primatologist Jane Goodall. Both chimpanzee species are considered to be Endangered.\nHuman activities have caused severe declines in the populations and ranges of both species.\nThreats to wild chimp populations include poaching, habitat destruction, and the illegal pet trade.\nSeveral conservation and rehabilitation organisations are dedicated to the survival of orangutans in the wild.");
            obj.called(ch);
            gh.chimpanzee();
            break;
            
            case 10:
            System.out.println("You have chosen Eagle");
            System.out.println();
            System.out.println("Scientific Name: Buteo jamaicensis");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("Eagles are large, powerfully built birds of prey, with a heavy head and beak.\nEven the smallest eagles, like the booted\neagle(which is comparable in size to a common buzzard or red-tailed hawk have relatively longer and more\nevenly broad wings, and more direct, faster flight – despite the reduced size of aerodynamic feathers.\nMost eagles are larger than any other raptors apart from some vultures. The smallest\nspecies of eagle is the South Nicobar serpent eagle (Spilornis klossi), at 450 g (0.99 lb) and 40 cm (16 in). The\nlargest species are discussed below. Like all birds of prey, eagles have\nvery large hooked beaks for tearing flesh from their prey, strong muscular legs, and powerful talons. The\nbeak is typically heavier than that of most other birds of prey. Eagles' eyes are\nextremely powerful, having up to 3.6 times human acuity for the martial eagle, which enables them to spot potential\nprey from a very long distance.[2] This keen eyesight is primarily attributed to their extremely large\npupils which ensure minimal diffraction (scattering) of the incoming light. The female of all known species of eagles is larger than the male.");
            obj.called(ch);
            gh.eagle();
            break;
            
            case 11:
            System.out.println("You have chosen Rabbit");
            System.out.println();
            System.out.println("Scientific Name: Oryctolagus cuniculus");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("Rabbits are small mammals in the family Leporidae of the order Lagomorpha, found in\nseveral parts of the world. There are eight different genera in thefamily classified as rabbits,\n including the European rabbit (Oryctolagus cuniculus), cottontail\nrabbits (genus Sylvilagus; 13 species), and the Amami rabbit (Pentalagus furnessi, an endangered\nspecies on Amami Ōshima, Japan). There are many other species of rabbit, and these, along with\npikas and hares, make up the order Lagomorpha. The male is called a buck and the female is a\ndoe; a young rabbit is a kitten or kit.Rabbit habitats, or rabbitats, include meadows, woods,\nforests, grasslands, deserts and wetlands. Rabbits live in groups,and the best known species,\nthe European rabbit, lives in underground burrows, or rabbit holes.\nA group of burrows is called a warren.More than half the world's rabbit population resides in\nNorth America.They are also native to southwestern Europe, Southeast Asia, Sumatra, some islands of\nJapan, and in parts of Africa and South America. They are not naturally found in most of Eurasia,\nwhere a number of species of hares are present. Rabbits first entered South America relatively\nrecently, as part of the Great American Interchange. Much of the continent has just one species\nof rabbit, the tapeti, while most of South America's southern cone is without rabbits.");
            obj.called(ch);
            gh.rabbit();
            break;
            
            case 12:
            System.out.println("You have chosen Cat");
            System.out.println();
            System.out.println("Scientific Name: Felis catus");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("The domestic cat(Felis catus or Felis silvestris catus)is a small, typically\nfurry, domesticated, and carnivorous mammal. They are often called house cats when\nkept as indoor pets or simply cats when there is no need to distinguish them from other felids and\nfelines.Cats are often valued by humans for companionship and their ability to hunt vermin.\nCats are similar in anatomy to the other felids, with strong, flexible bodies, quick reflexes\n, sharp retractable claws, and teeth adapted to killing small prey. Cat senses fit\n crepuscular and predatory ecological niche. Cats can hear sounds too faint or too high\nin frequency for human ears, such as those made by mice and other small animals. They can see\nin near darkness. Like most other mammals, cats have poorer color vision and a better sense\nof smell than humans.Cats have a high breeding rate. Under controlled breeding, they\n can be bred and shown as registered pedigree pets, a hobby known as cat fancy. Failure\nto control the breeding of pet cats by neutering and the abandonment of former\nhousehold pets has resulted in large numbers of feral cats worldwide, requiring population control.\nThis has contributed, along with habitat destruction and other factors, to extinction\nof many bird species. Cats have been known to extirpate a bird species within a specific region and\nmay have contributed to extinction of isolated island populations.[9] Cats are thought to be primarily\n though not solely, responsible for the extinction of 33 species of birds, and the presence of feral\nand free ranging cats makes some locations unsuitable for attempted species reestablishment in otherwise\nsuitable locations.");
            obj.called(ch);
            gh.cat();
            break;
            
            case 13:
            System.out.println("You have chosen Koala");
            System.out.println();
            System.out.println("Scientific Name: Phascolarctos cinereus");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("The koala is an arboreal herbivorous marsupial native to Australia. It is the only extant\nrepresentative of the family Phascolarctidae, and its closest living relatives are the wombats. The\nkoala is found in coastal areas of the mainland's eastern and southern regions, inhabiting\nQueensland, New South Wales, Victoria, and South Australia. It is easily recognisable by its stout,\ntailless body and large head with round, fluffy ears and large, spoon-shaped nose.\nThe koala has a body length of 60–85 cm (24–33 in) and weighs 4–15 kg (9–33 lb). Pelage colour\nranges from silver grey to chocolate brown. Koalas from the northern populations are typically\nsmaller and lighter in colour than their counterparts further south. These populations possibly are\nseparate subspecies, but this is disputed.Koalas typically inhabit open eucalypt woodlands, and\nthe leaves of these trees make up most of their diet. Because this eucalypt diet has limited nutritional\nand caloric content, koalas are largely sedentary and sleep up to 20 hours a day. They are\nasocial animals, and bonding exists only between mothers and dependent offspring. Adult males\ncommunicate with loud bellows that intimidate rivals and attract mates. Males mark their presence\nwith secretions from scent glands located on their chests. Being marsupials, koalas give birth to\nunderdeveloped young that crawl into their mothers' pouches, where they stay for the first six\nto seven months of their lives. These young koalas, known as joeys, are fully weaned\naround a year old. Koalas have few natural predators and parasites, but are threatened by various\npathogens, such as Chlamydiaceae bacteria and the koala retrovirus, as well as by bushfires\nand droughts.");
            obj.called(ch);
            gh.koala();
            break;
            
            case 14:
            System.out.println("You have chosen Dog");
            System.out.println();
            System.out.println("Scientific Name: Canis familiaris");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("The domestic dog (Canis lupus familiaris or Canis familiaris) is a domesticated canid which\nhas been selectively bred for millennia for various behaviors, sensory capabilities, and phys-\nical attributes.Although initially thought to have originated as a manmade variant of an extant\ncanid species (variously supposed as being the dhole,[3] golden jackal,[4] or gray wolf[5]),\nextensive genetic studies undertaken during the 2010s indicate that dogs diverged from an extinct\nwolf-like canid in Eurasia 40,000 years ago.[6] Being the oldest domesticated animals, their long\nassociation with people has allowed dogs to be uniquely attuned to human behavior,[7] as well as\nthrive on a starch-rich diet which would be inadequate for other canid species.Dogs perform many\nroles for people, such as hunting, herding, pulling loads, protection, assisting police and military,\ncompanionship, and, more recently, aiding handicapped individuals. This impact on human society has \ngiven them the nickname man's best friend in the Western world. In some cultures, however, dogs are\na source of meat.In breeding circles, a male canine is referred to as a dog, while a female is called\na bitch[18] (Middle English bicche, from Old English bicce, ultimately from Old Norse bikkja). A\ngroup of offspring is a litter. The father of a litter is called the sire, and the mother is\ncalled the dam. Offspring are, in general, called pups or puppies, from French poupée, until they\nare about a year old. The process of birth is whelping, from the Old English word hwelp.");
            obj.called(ch);
            gh.dog();
            break;
            
            case 15:
            System.out.println("You have chosen Snake");
            System.out.println();
            System.out.println("Scientific Name: Serpentes");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("Snakes are elongated, legless, carnivorous reptiles of the suborder Serpentes[2] that can be distinguished\nfrom legless lizards by their lack of eyelids and external ears. Like all squamates, snakes are\nectothermic, amniote vertebrates covered in overlapping scales. Many species of snakes have skulls\nwith several more joints than their lizard ancestors, enabling them to swallow prey much larger than\ntheir heads with their highly mobile jaws. To accommodate their narrow bodies, snakes' paired organs\n(such as kidneys) appear one in front of the other instead of side by side, and most have only one\nfunctional lung. Some species retain a pelvic girdle with a pair of vestigial claws on either side \nof the cloaca.Living snakes are found on every continent except Antarctica, and on most smaller land\nmasses — exceptions include some large islands, such as Ireland and New Zealand, and many small\nislands of the Atlantic and central Pacific.[3] Additionally, sea snakes are widespread throughout the\nIndian and Pacific Oceans. More than 20 families are currently recognized, comprising about 500 \ngenera and about 3,400 species.[4][5] They range in size from the tiny, 10 cm-long thread snake to\nthe reticulated python of up to 6.95 meters (22.8 ft) in length.[6] The fossil species Titanoboa\ncerrejonensis was 13 meters (43 ft) long.[7] Snakes are thought to have evolved from either burrowing\nor aquatic lizards, perhaps during the Jurassic period, with the earliest known fossils dating to\nbetween 143 and 167 Ma ago.[8] The diversity of modern snakes appeared during the Paleocene period\n(c 66 to 56 Ma ago). The oldest preserved descriptions of snakes can be found in the Brooklyn Papyrus.\nMost species are nonvenomous and those that have venom use it primarily to kill and subdue prey rather\nthan for self-defense. Some possess venom potent enough to cause painful injury or death to humans.\nNonvenomous snakes either swallow prey alive or kill by constriction.");
            obj.called(ch);
            gh.snake();
            break;
            
            case 16:
            System.out.println("You have chosen Ostrich");
            System.out.println();
            System.out.println("Scientific Name: Struthio camelus");
            System.out.println();
            System.out.println("Basic Information:");
            System.out.println();
            System.out.println("The ostrich or common ostrich (Struthio camelus) is either one or two species of large flightless\nbirds native to Africa, the only living member(s) of the genus Struthio, which is in the ratite\nfamily. Starting in 2014, the Somali ostrich is now considered a full species separate from the\ncommon ostrich.The ostrich shares the order Struthioniformes with the kiwis, emus, rheas and\ncassowaries. However, phylogenetic studies have shown that it is the basal extant member of\nPalaeognathae and is thus equally closely related to flighted tinamous.[4][5] It is distinctive\nin its appearance, with a long neck and legs, and can run at up to about 70 km/h (19 m/s; 43 mph)\n,[6] the fastest land speed of any bird.[7] The ostrich is the largest living species of bird and\nlays the largest eggs of any living bird (extinct elephant birds of Madagascar and the giant moa\nof New Zealand laid larger eggs).The ostrich's diet consists mainly of plant matter, though it also\neats invertebrates. It lives in nomadic groups of 5 to 50 birds. When threatened, the ostrich will\neither hide itself by lying flat against the ground, or run away. If cornered, it can attack with\na kick of its powerful legs. Mating patterns differ by geographical region, but territorial males\nfight for a harem of two to seven females.Ostriches usually weigh from 63 to 145 kilograms\n(139–320 lb), or as much as two adult humans.[6][8][9] Ostriches of the East African race (S. c.\nmassaicus) averaged 115 kg (254 lb) in males and 100 kg (220 lb) in females, while the nominate \nsubspecies (S. c. camelus) was found to average 111 kg (245 lb) in unsexed adults.[6] Exceptional\nmale ostriches (in the nominate subspecies) can weigh up to 156.8 kg (346 lb).[6] At sexual\nmaturity (two to four years), male ostriches can be from 2.1 to 2.8 m (6 ft 11 in to 9 ft 2 in) in\n height, while female ostriches range from 1.7 to 2.0 m (5 ft 7 in to 6 ft 7 in) tall.[6] New chicks\nare fawn in colour, with dark brown spots.[10] During the first year of life, chicks grow at about 25\ncm (9.8 in) per month. At one year of age, ostriches weigh approximately 45 kilograms (99 lb).\nTheir lifespan is up to 40–45 years.");
            obj.called(ch);
            gh.ostrich();
            break;
            
            default:
            System.out.println("Please choose an option from the given list");
        }
    }
}