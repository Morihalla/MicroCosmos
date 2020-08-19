package ElementaryParticles.Fermions.Particles.Quarks;

import FundamentalInteractions.Electromagnetism;
import FundamentalInteractions.Gravitation;
import FundamentalInteractions.StrongInteraction;
import FundamentalInteractions.WeakInteraction;
import IntrinsicProperties.ElectricCharge;
import IntrinsicProperties.SpinVector;

public abstract class Quark implements Electromagnetism, Gravitation, StrongInteraction, WeakInteraction {
ElectricCharge electricCharge;
double electricChargeValue;

long mass;
String colorCharge;

double Spin = 0.5;
SpinVector spinVector;

Generation generation;
}
